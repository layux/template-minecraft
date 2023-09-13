package io.layux.example.greeter.infrastructure.provider

import io.layux.example.greeter.application.contract.MessageProvider

/**
 *
 * @project template-minecraft
 * @package io.layux.example.greeter.infrastructure.provider
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 13/09/2023 12:09 p. m.
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class SimpleMessageProvider : MessageProvider {
    override fun getGreetingMessage(): String {
        return "Hello from Velocity!"
    }
}
