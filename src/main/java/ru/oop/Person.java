package ru.oop;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местопложения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Доехать на указанном транспорте до указанного места, при необходимости
     * дойти пешком до транспорта или места назначения
     *
     * @param destination место назначения
     * @param transport   транспорт
     */
    void goByTransport(Position destination, Transport transport);
}
