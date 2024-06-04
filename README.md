# Currency Converter

The Currency Converter is a Java project developed to facilitate the conversion of different currencies. This application allows users to convert values between various currencies using updated exchange rates. It is ideal for travelers, traders, and anyone who needs to conduct international financial transactions.

## Features

- Real-time conversion between various currencies.
- User-friendly and intuitive interface.
- Automatic update of exchange rates.
- Supports multiple global currencies.

## Usage

1. Choose the desired currency conversion option from the menu.
2. Enter the amount you wish to convert.
3. The converted amount will be displayed based on the latest exchange rates.

## Dependencies

This project uses the following dependencies:

### Gson

Gson is a Java library that converts Java objects into their JSON representation and vice versa. This project uses Gson to parse the JSON responses from the exchange rate API.

Add the dependency in your `pom.xml` (for Maven):

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
