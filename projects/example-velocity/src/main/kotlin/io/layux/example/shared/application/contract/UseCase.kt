package io.layux.example.shared.application.contract

/**
 *
 * @project template-minecraft
 * @package io.layux.example.shared
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 13/09/2023 12:04 p. m.
 *
 * © 2023 Layux LLC. All rights reserved.
 */
interface UseCase<TInput, TOutput> {
    fun execute(input: TInput): TOutput
}
