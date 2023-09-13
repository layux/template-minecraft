package io.layux.example.api

/**
 *
 * @project template-minecraft
 * @package io.layux.example.greeter.application.contract
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 13/09/2023 12:09 p. m.
 *
 * © 2023 Layux LLC. All rights reserved.
 */
interface MessageProvider {
    /**
     * This method is used to get the greeting message.
     *
     * @return String
     */
    fun getGreetingMessage(): String
}
