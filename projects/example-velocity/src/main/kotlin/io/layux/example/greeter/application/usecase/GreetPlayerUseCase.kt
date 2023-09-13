package io.layux.example.greeter.application.usecase

import javax.inject.Inject

/**
 * This class is used to greet a player, its invoked by the PlayerEventsListener class.
 * This class is a use case, it should not contain any logic related to the infrastructure.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.greeter.application.usecase
 * @date 13/09/23 7:57
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class GreetPlayerUseCase @Inject() constructor(private val messageProvider: MessageProvider) : UseCase<GreetPlayerInput> {
    override fun execute(input: GreetPlayerInput) {
        input.player.sendMessage(messageProvider.provideMessage())
    }
}
