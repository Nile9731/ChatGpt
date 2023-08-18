Spring Boot  basic architecture:

1. Model  class- Attributes are created here. For example, user's name,email,phone,etc. (MVC - model view controller)
2. Controller class- Defines the URL. This decides what to show to the user.
3. Service class- All the business logics/functions/methods are created here. Controller calls the service methods.
4. Repository class- This directly interacts with DB. Pre defined sql queries options are available here to interact with DB.

Chat GPT Project

Open AI API:
1. While calling/requesting this API (https://api.openai.com/v1/chat/completions), it requires few parameters which are:
	- model: chatgpt-turbo
	- messages: [role: "user" ,content: "Hi, I am Nilesh"]
	- max_tokens:

2. In response, we get the following:
{
  "id": "chatcmpl-123",
  "object": "chat.completion",
  "created": 1677652288,
  "choices": [{
    "index": 0,
    "message": {
      "role": "assistant",
      "content": "\n\nHello there, how may I assist you today?",
    },
    "finish_reason": "stop"
  }],
  "usage": {
    "prompt_tokens": 9,
    "completion_tokens": 12,
    "total_tokens": 21
  }
}

Spring Boot:
1. Will create 2 model classes, so that these variables/attributes can be used inside controller and service:
	- message request: will define attributes like model, messages (role, content), etc.
	- message response: attributes like choices, message, usage, etc.

2. Controller will handle the urls. Will define two URLs:
	- (/) this will return simple index.html file.
	- (/chat) after submitting any question in chatbox, it will trigger this url. In this case it will call Service Class method.
	
3. In Service class, will define one method, which will call the Open AI API.
	- First it will call the API with bearer token key, with following parameters such as model, messages: [role: ,content: ], etc.
	- Secondly, after getting a successful response, it will parse that unstructured response, and pass it to controller class back.
	
4. After getting data from service class method, controller will pass this data to index.html file, and show it there.
