
# Документация API
## Описание

API предназначен для подсчета количества вхождений каждого символа в строке.

## URL
/api/count-string

## Метод
POST

## Формат входных данных
{
  "inputString": "string"
}

- inputString - строка, для которой нужно подсчитать количество вхождений каждого символа.

## Формат выходных данных
{
  "result": {
    "character": count
  }
}

- result - отображение символов и их количества в строке.

## Пример запроса
POST /api/count-string HTTP/1.1
Host: example.com
Content-Type: application/json

{
  "inputString": "Hello World!"
}


## Пример ответа
HTTP/1.1 200 OK
Content-Type: application/json

{
  "resultMap": {
    "l": 3,
    "o": 2,
    "H": 1,
    "e": 1,
    " ": 1,
    "W": 1,
    "r": 1,
    "d": 1,
    "!": 1
  }
}
