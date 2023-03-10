FROM public.ecr.aws/lambda/java:11

COPY build/classes ${LAMBDA_TASK_ROOT}
COPY build/libs/* ${LAMBDA_TASK_ROOT}/lib/

CMD ["Handler::handleRequest"]