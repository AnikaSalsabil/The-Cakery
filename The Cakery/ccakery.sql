-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2020 at 06:26 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ccakery`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `cellno` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `fullname`, `username`, `email`, `password`, `address`, `cellno`) VALUES
(2001, 'Anika Salsabil', 'anika33', 'anika@gmail.com', '123', 'Niketon', '01679486690'),
(2002, 'Fariha Tahsin Chowdhury', 'farihachy', 'fariha@gmail.com', '456', 'Chittagong', '01631077026'),
(2003, 'Muhammad Maruf Rayhan', 'maruf33', 'rayhan@gmail.com', '12345', 'Mirpur', '01705524762'),
(2004, 'Diyab Mahmud', 'DADYNAMICS', 'falwyudg@gmail.com', '1234567890', 'Los Angels', '81966123412'),
(2005, 'sneha maliat', 'smaliat', 'ahensmaliat@yahoo.com', '2wdcvfe3', '25/5B,mohammadpur,dhaka', '01521212559');

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE `delivery` (
  `del_id` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`del_id`) VALUES
(1),
(2),
(3);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_id` int(100) NOT NULL,
  `emp_name` varchar(100) NOT NULL,
  `emp_uname` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `emp_cellno` varchar(100) NOT NULL,
  `position` varchar(100) DEFAULT NULL,
  `salary` decimal(18,2) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `left_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `emp_name`, `emp_uname`, `password`, `emp_cellno`, `position`, `salary`, `join_date`, `left_date`) VALUES
(1001, 'Anika Salsabil', 'rayhan33', '123', '01679486690', 'Manager', '10000.00', '2018-02-01', '2018-02-28'),
(1004, 'Fariha Tahsin Chowdhury', 'ftchy', '456', '0160231245', 'Managing Director', '20000.00', '2018-02-04', '2018-05-29');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_id` int(100) NOT NULL,
  `item_name` varchar(100) NOT NULL,
  `item_price` decimal(18,2) DEFAULT NULL,
  `item_type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_id`, `item_name`, `item_price`, `item_type`) VALUES
(1, 'Red Velvet Cupcake', '250.00', 'Cake'),
(2, 'Blueberry Cheesecake', '350.00', 'Cake'),
(3, 'Vanilla Tart', '300.00', 'Tart'),
(4, 'Chocolate Mousse', '150.00', 'Mousse'),
(5, 'Nutella Brownie', '50.00', 'Brownie'),
(6, 'Peanut Butter Bar', '95.00', 'Brownie'),
(7, 'Blackforest Cake', '780.00', 'Cake'),
(8, 'Cinamon Rolls', '100.00', 'Bread'),
(9, 'Puff Pastry', '65.00', 'Bread'),
(10, 'Strawberry Shortcake', '450.00', 'Bread');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(100) NOT NULL,
  `customer_id` int(100) DEFAULT NULL,
  `item_id` int(100) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `quantity` varchar(100) DEFAULT NULL,
  `order_type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `customer_id`, `item_id`, `date`, `quantity`, `order_type`) VALUES
(1, 2001, 1, '2018-01-05', '3', 'Delivery'),
(2, 2002, 2, '2018-01-18', '2', 'Pickup'),
(3, 2003, 1, '2018-01-19', '5', 'Delivery'),
(4, 2004, 5, '2018-01-23', '6', 'Delivery'),
(5, 2005, 7, '2018-01-29', '4', 'Pickup');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `pay_id` int(100) NOT NULL,
  `customer_id` int(100) DEFAULT NULL,
  `del_id` int(100) DEFAULT NULL,
  `pickup_id` int(100) DEFAULT NULL,
  `paid_amount` decimal(18,2) DEFAULT NULL,
  `del_charge` decimal(18,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`pay_id`, `customer_id`, `del_id`, `pickup_id`, `paid_amount`, `del_charge`) VALUES
(1, 2001, 1, NULL, '1000.00', '30.00'),
(2, 2002, NULL, 1, '1500.00', NULL),
(3, 2003, 2, NULL, '500.00', '30.00'),
(4, 2004, 3, NULL, '2500.00', '30.00'),
(5, 2005, NULL, 2, '2400.00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pickups`
--

CREATE TABLE `pickups` (
  `pickup_id` int(100) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pickups`
--

INSERT INTO `pickups` (`pickup_id`, `date`) VALUES
(1, '2018-01-18'),
(2, '2018-01-18');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
  ADD PRIMARY KEY (`del_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`pay_id`);

--
-- Indexes for table `pickups`
--
ALTER TABLE `pickups`
  ADD PRIMARY KEY (`pickup_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2006;

--
-- AUTO_INCREMENT for table `delivery`
--
ALTER TABLE `delivery`
  MODIFY `del_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `emp_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1005;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `item_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `pay_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pickups`
--
ALTER TABLE `pickups`
  MODIFY `pickup_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
