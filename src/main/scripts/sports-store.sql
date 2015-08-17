
--
-- Database: `sportsstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `delivery_channel`
--

CREATE TABLE IF NOT EXISTS `delivery_channel` (
  `delivery_channel_id` varchar(2) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_channel_description` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `delivery_channel_message` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `activation_status` varchar(1) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `delivery_channel`
--

INSERT INTO `delivery_channel` (`delivery_channel_id`, `delivery_channel_description`, `delivery_channel_message`, `activation_status`) VALUES
('01', 'Reserved1', NULL, 'N'),
('02', 'Reserved2', NULL, 'N'),
('03', 'Reserved3', NULL, 'N'),
('04', 'Channel1', NULL, 'Y'),
('05', 'Channel2', NULL, 'Y'),
('10', 'Channel3', NULL, 'Y'),
('11', 'Channel4', NULL, 'Y'),
('12', 'Channel5', NULL, 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `activation_status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `biller_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `billing_address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `billing_contact_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `billing_contact_number` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `billing_email_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `billing_postal_code` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mailing_address` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mailing_contact_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mailing_contact_number` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mailing_email_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mailing_postal_code` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_registration_number` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_account_number` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_account_type` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_bank_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_branch_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_settlement_limit` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_settlement_type` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `debit_account_number` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `debit_account_type` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `debit_bank_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `debit_branch_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date_of_incorportaion` date DEFAULT NULL,
  `fs_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `merchant_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `logo_path` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `min_fixed_amount` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payement_cut_off_duration` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `penalty_cut_off_duration` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `display_order` int(11) DEFAULT NULL,
  `ret_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `display_logo` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `credit_card_insert_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `encryption_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `receipt_required` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `excess_payment_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `expire_bills_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `invoice_print_name` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `auto_report_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `manual_entry_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `minimum_pay_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `part_payment_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `scan_bill_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `additional_info_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `adhoc_user_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bill_presentment_allowed` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `showdisplay` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `remark1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `remark2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `report_cut_over_time` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `static_message` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `category_id` bigint(20) NOT NULL,
  `created_date` date DEFAULT NULL,
  `description` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKED8DCCEF3AC9AEA` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `product_status`, `activation_status`, `biller_name`, `billing_address`, `billing_contact_name`, `billing_contact_number`, `billing_email_id`, `billing_postal_code`, `mailing_address`, `mailing_contact_name`, `mailing_contact_number`, `mailing_email_id`, `mailing_postal_code`, `company_registration_number`, `credit_account_number`, `credit_account_type`, `credit_bank_name`, `credit_branch_name`, `credit_settlement_limit`, `credit_settlement_type`, `debit_account_number`, `debit_account_type`, `debit_bank_name`, `debit_branch_name`, `date_of_incorportaion`, `fs_name`, `merchant_id`, `logo_path`, `min_fixed_amount`, `payement_cut_off_duration`, `penalty_cut_off_duration`, `display_order`, `ret_id`, `display_logo`, `credit_card_insert_allowed`, `encryption_allowed`, `receipt_required`, `excess_payment_allowed`, `expire_bills_allowed`, `invoice_print_name`, `auto_report_allowed`, `manual_entry_allowed`, `minimum_pay_allowed`, `part_payment_allowed`, `scan_bill_allowed`, `additional_info_allowed`, `adhoc_user_allowed`, `bill_presentment_allowed`, `showdisplay`, `remark1`, `remark2`, `report_cut_over_time`, `static_message`, `category_id`, `created_date`, `description`) VALUES
(1, 'Cricket Bat', 'Available', 'Active', 'Adidas', 'ABC chowk New Delhi', 'Century Sports', '123456788', 'product@century.com', '695003', 'ABC chowk New Delhi', 'Century Sports', '123456788', 'product@century.com', '695003', '532431343', '123456786', 'xyz', 'Indian Bank', 'Mumbai', '100000', 'xyz', '1234567878', 'abc', 'ICICI', 'Mumbai', '2015-08-01', 'Standard', '1000', 'cricket_bat.jpg', '1000', '1000', '1000', 101, '111', 'Y', 'Y', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', 'N', 'Y', 'N', 'Y', 'Y', 'Y', 'Test Remark', 'Test Remark 2', '1000', 'Message ', 2, '2015-08-06', 'Quality Product for First Class Cricket'),
(2, 'Soccer Ball', 'Available', 'Active', 'Nike', 'ABC chowk New Delhi', 'Century Sports', '123456788', 'product@century.com', '695003', 'ABC chowk New Delhi', 'Century Sports', '123456788', 'product@century.com', '695003', '532431343', '123456786', 'xyz', 'Indian Bank', 'Mumbai', '100000', 'xyz', '1234567878', 'abc', 'ICICI', 'Mumbai', '2015-08-01', 'Standard', '1000', 'product_soccer_ball.jpg', '1000', '1000', '1000', 101, '111', 'Y', 'Y', 'Y', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'N', 'N', 'Y', 'N', 'Y', 'Y', 'Y', 'Test Remark', 'Test Remark 2', '1000', 'Message ', 2, '2015-08-06', 'Quality Product for Soccer');

-- --------------------------------------------------------

--
-- Table structure for table `product_category`
--

CREATE TABLE IF NOT EXISTS `product_category` (
  `category_id` bigint(20) NOT NULL,
  `category_description` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `display_logo` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `display_order` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `show_display` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `product_category`
--

INSERT INTO `product_category` (`category_id`, `category_description`, `display_logo`, `display_order`, `show_display`) VALUES
(1, 'Sports Item', 'Y', '10', 'Y'),
(2, 'Food Item', 'Y', '12', 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `product_channel_mapping`
--

CREATE TABLE IF NOT EXISTS `product_channel_mapping` (
  `product_channel_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `channel_id` varchar(2) DEFAULT NULL,
  `channel_activation_date` timestamp NULL DEFAULT NULL,
  `channel_deactivation_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`product_channel_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `product_channel_mapping`
--

INSERT INTO `product_channel_mapping` (`product_channel_id`, `product_id`, `channel_id`, `channel_activation_date`, `channel_deactivation_date`) VALUES
(1, 1, '04', '2015-07-31 13:00:00', '2015-12-30 13:00:00'),
(2, 2, '04', '2015-07-31 13:00:00', '2015-12-30 13:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `service_type`
--

CREATE TABLE IF NOT EXISTS `service_type` (
  `service_type_id` bigint(20) NOT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `service_type_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_type_short_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_type_status` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`service_type_id`),
  KEY `fk_service_type_1_idx` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `service_type`
--

INSERT INTO `service_type` (`service_type_id`, `product_id`, `service_type_name`, `service_type_short_name`, `service_type_status`) VALUES
(1000001, 1, 'Free Home Delivery', 'FHD', 'Available'),
(1000002, 1, 'Cash On Delivery', 'COD', 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE IF NOT EXISTS `transaction` (
  `txn_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `biller_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bill_reference_number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bill_number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_type_id` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address_1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address_2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `contact_number` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `zipcode` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `paid_amount` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payment_mode` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `transaction_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_transaction_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trans_type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `txn_date` datetime DEFAULT NULL,
  `txn_type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bank_product_id` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_bank_code` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_branch_code` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_account_number` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `delivery_channel` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `customer_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `consumer_number` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `consumer_number_flag` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `due_date` datetime DEFAULT NULL,
  `response_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `resp_desc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved3` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved4` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved5` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved6` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved7` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved8` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved9` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reserved10` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`txn_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`txn_id`, `biller_name`, `bill_reference_number`, `bill_number`, `service_type_id`, `address_1`, `address_2`, `contact_number`, `zipcode`, `paid_amount`, `payment_mode`, `transaction_id`, `sub_transaction_id`, `trans_type`, `txn_date`, `txn_type`, `bank_product_id`, `product_bank_code`, `product_branch_code`, `product_account_number`, `delivery_channel`, `customer_name`, `consumer_number`, `consumer_number_flag`, `due_date`, `response_code`, `resp_desc`, `reserved1`, `reserved2`, `reserved3`, `reserved4`, `reserved5`, `reserved6`, `reserved7`, `reserved8`, `reserved9`, `reserved10`) VALUES
(1, 'Nestle', '99999996', '10000003', '1000001', 'ABC chowk New Delhi', 'ABC chowk New Delhi', '123456788', '695003', '1000', 'Online', '111111945', '12345', 'Direct', '2015-08-03 00:00:00', 'Nil', '234', '11223', '623', '12345678912', '04', 'Rajesh mehta', '7805470395', 'Y', '2015-08-24 00:00:00', '123', 'Transaction Successful', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'Nestle', NULL, '234546', '1000001', NULL, NULL, NULL, NULL, '1000', 'A', 'test', '5676753', '99', '2015-06-23 15:25:25', 'E', NULL, NULL, NULL, NULL, '11', 'Vinay Kumar', '123456', NULL, NULL, '000', 'SUCCESS', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'Nestle', NULL, '234546', '1000001', NULL, NULL, NULL, NULL, '1000', 'A', NULL, '5676753', '99', '2015-06-23 15:25:25', 'N', NULL, NULL, NULL, NULL, '11', 'Vinay Kumar', '123456', NULL, NULL, '000', 'SUCCESS', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FKED8DCCEF3AC9AEA` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`category_id`);

--
-- Constraints for table `service_type`
--
ALTER TABLE `service_type`
  ADD CONSTRAINT `fk_service_type_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;


