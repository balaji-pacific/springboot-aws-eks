This simple application is created for running the application aws EKS through ECR.

After creating ECR.
Below steps to follow for pushing the local image.
1. aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 069631898237.dkr.ecr.us-east-1.amazonaws.com
2. Tage the image using **docker tag springboot-eks:latest 069631898237.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest**
3. Push the image **docker push 069631898237.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest**

Image name in ECR : 069631898237.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest

Below comment for creating cluster in EKS
1. eksctl create cluster --name balajisn-cluster --version 1.28 --nodes=1 --node-type=t2.small --region us-east-1
2. Update kubectl pointing to eks cluster balajisn-cluster by using **aws eks --region us-east-1 update-kubeconfig --name balajisn-cluster**
3. Run the below command for spin the pod
kubectl apply -f k8config.yaml
4. Run kubectl get svc for listing the service
5. Run kubectl get pod for list number of pods
6. Once the pod is up and running we can use the below URL for accessing the application.
   http://ad6b3cb7b719a4f1d8a33688da19292a-1221498205.us-east-1.elb.amazonaws.com/helloworld