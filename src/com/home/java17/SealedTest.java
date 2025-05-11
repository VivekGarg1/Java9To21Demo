package com.home.java17;


/*interface Driveable{ }
class Car implements Driveable{}
class Bike implements Driveable{}*/

sealed interface Driveable permits Vehicle {}
sealed class Vehicle implements Driveable permits Car, Bike{}
final class Car extends Vehicle{}
non-sealed class Bike extends Vehicle{}
public class SealedTest {
}
