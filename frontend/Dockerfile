# pull the base image
FROM node:alpine

# set the working direction
WORKDIR /app

# add `/app/node_modules/.bin` to $PATH
ENV PATH /app/node_modules/.bin:$PATH

# install app dependencies
COPY package.json ./

COPY package-lock.json ./

RUN npm install
# add app
COPY . ./
RUN npm run build
RUN npm config set registry http://registry.npmjs.org/
RUN npm install -g serve


# start app
CMD ["serve", "-s", "build"]