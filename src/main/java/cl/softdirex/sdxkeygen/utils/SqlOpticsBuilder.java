/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.softdirex.sdxkeygen.utils;

/**
 *
 * @author sdx
 */
public class SqlOpticsBuilder {
    public static String getSqlBDOptics(String bdName){
        return "-- phpMyAdmin SQL Dump\n" +
"-- version 4.8.4\n" +
"-- https://www.phpmyadmin.net/\n" +
"--\n" +
"-- Servidor: 10.1.2.127:3306\n" +
"-- Tiempo de generación: 25-01-2019 a las 02:12:31\n" +
"-- Versión del servidor: 10.2.16-MariaDB\n" +
"-- Versión de PHP: 7.2.13\n" +
"\n" +
"SET SQL_MODE = \"NO_AUTO_VALUE_ON_ZERO\";\n" +
"SET AUTOCOMMIT = 0;\n" +
"START TRANSACTION;\n" +
"SET time_zone = \"+00:00\";\n" +
"\n" +
"\n" +
"/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;\n" +
"/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;\n" +
"/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;\n" +
"/*!40101 SET NAMES utf8mb4 */;\n" +
"\n" +
"--\n" +
"-- Base de datos: `"+bdName+"`\n" +
"--\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `armazon`\n" +
"--\n" +
"\n" +
"CREATE TABLE `armazon` (\n" +
"  `arm_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_tipo` int(11) NOT NULL,\n" +
"  `arm_marca` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_precio_marca` int(11) NOT NULL,\n" +
"  `arm_cristal` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_precio_cristal` int(11) NOT NULL,\n" +
"  `arm_add` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_od_a` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_od_esf` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_od_cil` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_oi_a` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_oi_esf` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_oi_cil` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_dp` int(11) NOT NULL,\n" +
"  `arm_endurecido` int(11) NOT NULL,\n" +
"  `arm_capa` int(11) NOT NULL,\n" +
"  `arm_plus_max` int(11) NOT NULL,\n" +
"  `ficha_fch_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `arm_estado` int(11) NOT NULL,\n" +
"  `arm_last_update` date NOT NULL,\n" +
"  `arm_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `cliente`\n" +
"--\n" +
"\n" +
"CREATE TABLE `cliente` (\n" +
"  `cli_rut` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_telefono1` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_telefono2` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_email` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_direccion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_comuna` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_ciudad` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cli_sexo` int(11) NOT NULL,\n" +
"  `cli_nacimiento` date NOT NULL,\n" +
"  `cli_estado` int(11) NOT NULL,\n" +
"  `cli_last_update` date NOT NULL,\n" +
"  `cli_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `convenio`\n" +
"--\n" +
"\n" +
"CREATE TABLE `convenio` (\n" +
"  `cnv_id` int(11) NOT NULL,\n" +
"  `cnv_nombre` varchar(45) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `cnv_fecha_inicio` date NOT NULL,\n" +
"  `cnv_fecha_fin` date NOT NULL,\n" +
"  `cnv_cuotas` int(11) NOT NULL,\n" +
"  `cnv_fecha_cobro` date NOT NULL,\n" +
"  `cnv_monto_maximo` int(11) NOT NULL,\n" +
"  `cnv_monto_pp` int(11) NOT NULL,\n" +
"  `cnv_maximo_clientes` int(11) NOT NULL,\n" +
"  `descuento_des_id` int(11) NOT NULL,\n" +
"  `cnv_porc_valor_adicional` int(11) NOT NULL,\n" +
"  `institucion_ins_id` varchar(25) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `cnv_estado` int(11) NOT NULL,\n" +
"  `cnv_last_update` date NOT NULL,\n" +
"  `cnv_last_hour` int(11) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `cristal`\n" +
"--\n" +
"\n" +
"CREATE TABLE `cristal` (\n" +
"  `cri_id` int(11) NOT NULL,\n" +
"  `cri_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `cri_precio` int(11) NOT NULL,\n" +
"  `cri_estado` int(11) NOT NULL,\n" +
"  `cri_last_update` date NOT NULL,\n" +
"  `cri_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `cuotas_convenio`\n" +
"--\n" +
"\n" +
"CREATE TABLE `cuotas_convenio` (\n" +
"  `cc_id` varchar(25) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `cc_fecha` date NOT NULL,\n" +
"  `cc_fecha_pagado` date NOT NULL,\n" +
"  `cc_monto` int(11) NOT NULL,\n" +
"  `tipo_pago_tp_id` int(11) NOT NULL,\n" +
"  `convenio_cnv_id` int(11) NOT NULL,\n" +
"  `cc_estado` int(11) NOT NULL,\n" +
"  `cc_last_update` date NOT NULL,\n" +
"  `cc_last_hour` int(11) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `descuento`\n" +
"--\n" +
"\n" +
"CREATE TABLE `descuento` (\n" +
"  `des_id` int(11) NOT NULL,\n" +
"  `des_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `des_descripcion` text COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `des_porc` int(11) NOT NULL,\n" +
"  `des_monto` int(11) NOT NULL,\n" +
"  `des_estado` int(11) NOT NULL,\n" +
"  `des_last_update` date NOT NULL,\n" +
"  `des_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `despacho`\n" +
"--\n" +
"\n" +
"CREATE TABLE `despacho` (\n" +
"  `dsp_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `dsp_rut` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `dsp_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `dsp_fecha` date NOT NULL,\n" +
"  `ficha_fch_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `dsp_estado` int(11) NOT NULL,\n" +
"  `dsp_last_update` date NOT NULL,\n" +
"  `dsp_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `doctor`\n" +
"--\n" +
"\n" +
"CREATE TABLE `doctor` (\n" +
"  `doc_rut` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `doc_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `doc_telefono` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `doc_mail` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `doc_estado` int(11) NOT NULL,\n" +
"  `doc_last_update` date NOT NULL,\n" +
"  `doc_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `equipo`\n" +
"--\n" +
"\n" +
"CREATE TABLE `equipo` (\n" +
"  `eq_id` int(11) NOT NULL,\n" +
"  `eq_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `eq_licencia` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `eq_bd` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `eq_bd_user` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `eq_bd_pass` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `eq_bd_url` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `eq_estado` int(11) NOT NULL,\n" +
"  `eq_last_update` date NOT NULL,\n" +
"  `eq_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `ficha`\n" +
"--\n" +
"\n" +
"CREATE TABLE `ficha` (\n" +
"  `fch_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `fch_fecha` date NOT NULL,\n" +
"  `fch_fecha_entrega` date NOT NULL,\n" +
"  `fch_lugar_entrega` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `fch_hora_entrega` varchar(15) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `fch_obs` text COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `fch_valor_total` int(11) NOT NULL,\n" +
"  `fch_descuento` int(11) NOT NULL,\n" +
"  `fch_saldo` int(11) NOT NULL,\n" +
"  `cliente_cli_rut` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `doctor_doc_rut` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `institucion_ins_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `despacho_dsp_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `usuario_us_id` int(11) NOT NULL,\n" +
"  `convenio_cnv_id` int(11) NOT NULL,\n" +
"  `fch_estado` int(11) NOT NULL,\n" +
"  `fch_last_update` date NOT NULL,\n" +
"  `fch_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `historial_pago`\n" +
"--\n" +
"\n" +
"CREATE TABLE `historial_pago` (\n" +
"  `hp_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `hp_fecha` date NOT NULL,\n" +
"  `hp_abono` int(11) NOT NULL,\n" +
"  `tipo_pago_tp_id` int(11) NOT NULL,\n" +
"  `ficha_fch_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `hp_estado` int(11) NOT NULL,\n" +
"  `hp_last_update` date NOT NULL,\n" +
"  `hp_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `institucion`\n" +
"--\n" +
"\n" +
"CREATE TABLE `institucion` (\n" +
"  `ins_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_telefono` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_mail` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_web` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_direccion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_comuna` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_ciudad` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `ins_estado` int(11) NOT NULL,\n" +
"  `ins_last_update` date NOT NULL,\n" +
"  `ins_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `intern_stock`\n" +
"--\n" +
"\n" +
"CREATE TABLE `intern_stock` (\n" +
"  `id` int(11) NOT NULL,\n" +
"  `id_lente` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `stock` int(11) NOT NULL,\n" +
"  `estado` int(11) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `inventario`\n" +
"--\n" +
"\n" +
"CREATE TABLE `inventario` (\n" +
"  `inv_id` int(11) NOT NULL,\n" +
"  `inv_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `inv_descripcion` text COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `inv_estado` int(11) NOT NULL,\n" +
"  `inv_last_update` date NOT NULL,\n" +
"  `inv_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `lente`\n" +
"--\n" +
"\n" +
"CREATE TABLE `lente` (\n" +
"  `len_id` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `len_color` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `len_tipo` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `len_marca` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `len_material` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `len_flex` int(11) NOT NULL,\n" +
"  `len_clasificacion` int(11) NOT NULL,\n" +
"  `len_descripcion` text COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `len_precio_ref` int(11) NOT NULL,\n" +
"  `len_precio_act` int(11) NOT NULL,\n" +
"  `len_stock` int(11) NOT NULL,\n" +
"  `len_stock_min` int(11) NOT NULL,\n" +
"  `inventario_inv_id` int(11) NOT NULL,\n" +
"  `len_estado` int(11) NOT NULL,\n" +
"  `len_last_update` date NOT NULL,\n" +
"  `len_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `message`\n" +
"--\n" +
"\n" +
"CREATE TABLE `message` (\n" +
"  `msg_id` int(11) NOT NULL,\n" +
"  `us_id_remitente` int(11) NOT NULL,\n" +
"  `us_id_destinatario` int(11) NOT NULL,\n" +
"  `msg_asunto` varchar(45) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `msg_content` text COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `msg_fecha` date NOT NULL,\n" +
"  `msg_hora` varchar(25) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `msg_estado` int(11) NOT NULL,\n" +
"  `msg_last_update` date NOT NULL,\n" +
"  `msg_last_hour` int(11) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `oficina`\n" +
"--\n" +
"\n" +
"CREATE TABLE `oficina` (\n" +
"  `of_id` int(11) NOT NULL,\n" +
"  `of_nombre` varchar(45) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_direccion` varchar(45) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_ciudad` varchar(45) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_telefono1` varchar(25) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_telefono2` varchar(25) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_web` varchar(100) COLLATE utf8_unicode_ci NOT NULL,\n" +
"  `of_estado` int(11) NOT NULL,\n" +
"  `of_last_update` date NOT NULL,\n" +
"  `of_last_hour` int(11) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `registro_bajas`\n" +
"--\n" +
"\n" +
"CREATE TABLE `registro_bajas` (\n" +
"  `rb_id` varchar(25) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `rb_fecha` date NOT NULL,\n" +
"  `lente_len_id` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `rb_cantidad` int(11) NOT NULL,\n" +
"  `rb_obs` text COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `rb_estado` int(11) NOT NULL,\n" +
"  `rb_last_update` date NOT NULL,\n" +
"  `rb_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `tipo_pago`\n" +
"--\n" +
"\n" +
"CREATE TABLE `tipo_pago` (\n" +
"  `tp_id` int(11) NOT NULL,\n" +
"  `tp_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `tp_estado` int(11) NOT NULL,\n" +
"  `tp_last_update` date NOT NULL,\n" +
"  `tp_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"--\n" +
"-- Volcado de datos para la tabla `tipo_pago`\n" +
"--\n" +
"\n" +
"INSERT INTO `tipo_pago` (`tp_id`, `tp_nombre`, `tp_estado`, `tp_last_update`, `tp_last_hour`) VALUES\n" +
"(1, 'Convenio', 1, '2019-01-15', 184115),\n" +
"(4, 'Cheque', 1, '2018-10-21', 35537),\n" +
"(3, 'Transbank', 1, '2018-10-21', 35349),\n" +
"(2, 'Efectivo', 1, '2018-10-21', 35313);\n" +
"\n" +
"-- --------------------------------------------------------\n" +
"\n" +
"--\n" +
"-- Estructura de tabla para la tabla `usuario`\n" +
"--\n" +
"\n" +
"CREATE TABLE `usuario` (\n" +
"  `us_id` int(11) NOT NULL,\n" +
"  `us_nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `us_username` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `us_email` varchar(45) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `us_pass` varchar(100) COLLATE utf8_spanish_ci NOT NULL,\n" +
"  `us_tipo` int(11) NOT NULL,\n" +
"  `us_estado` int(11) NOT NULL,\n" +
"  `us_last_update` date NOT NULL,\n" +
"  `us_last_hour` int(11) NOT NULL\n" +
") ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;\n" +
"\n" +
"--\n" +
"-- Volcado de datos para la tabla `usuario`\n" +
"--\n" +
"\n" +
"INSERT INTO `usuario` (`us_id`, `us_nombre`, `us_username`, `us_email`, `us_pass`, `us_tipo`, `us_estado`, `us_last_update`, `us_last_hour`) VALUES\n" +
"(1, 'Admin', 'admin', '', 'W6ktyGtKLSE=', 1, 1, '2019-01-15', 184115),\n" +
"(2, 'Proveedor Del Software', 'root', 'contacto@softdirex.cl', '1UdiBcL2BZ1YBcrGB7hKKg==', 1, 1, '2018-11-15', 62534);\n" +
"\n" +
"--\n" +
"-- Índices para tablas volcadas\n" +
"--\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `armazon`\n" +
"--\n" +
"ALTER TABLE `armazon`\n" +
"  ADD PRIMARY KEY (`arm_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `cliente`\n" +
"--\n" +
"ALTER TABLE `cliente`\n" +
"  ADD PRIMARY KEY (`cli_rut`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `convenio`\n" +
"--\n" +
"ALTER TABLE `convenio`\n" +
"  ADD PRIMARY KEY (`cnv_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `cristal`\n" +
"--\n" +
"ALTER TABLE `cristal`\n" +
"  ADD PRIMARY KEY (`cri_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `cuotas_convenio`\n" +
"--\n" +
"ALTER TABLE `cuotas_convenio`\n" +
"  ADD PRIMARY KEY (`cc_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `descuento`\n" +
"--\n" +
"ALTER TABLE `descuento`\n" +
"  ADD PRIMARY KEY (`des_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `despacho`\n" +
"--\n" +
"ALTER TABLE `despacho`\n" +
"  ADD PRIMARY KEY (`dsp_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `doctor`\n" +
"--\n" +
"ALTER TABLE `doctor`\n" +
"  ADD PRIMARY KEY (`doc_rut`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `equipo`\n" +
"--\n" +
"ALTER TABLE `equipo`\n" +
"  ADD PRIMARY KEY (`eq_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `ficha`\n" +
"--\n" +
"ALTER TABLE `ficha`\n" +
"  ADD PRIMARY KEY (`fch_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `historial_pago`\n" +
"--\n" +
"ALTER TABLE `historial_pago`\n" +
"  ADD PRIMARY KEY (`hp_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `institucion`\n" +
"--\n" +
"ALTER TABLE `institucion`\n" +
"  ADD PRIMARY KEY (`ins_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `inventario`\n" +
"--\n" +
"ALTER TABLE `inventario`\n" +
"  ADD PRIMARY KEY (`inv_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `lente`\n" +
"--\n" +
"ALTER TABLE `lente`\n" +
"  ADD PRIMARY KEY (`len_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `message`\n" +
"--\n" +
"ALTER TABLE `message`\n" +
"  ADD PRIMARY KEY (`msg_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `oficina`\n" +
"--\n" +
"ALTER TABLE `oficina`\n" +
"  ADD PRIMARY KEY (`of_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `registro_bajas`\n" +
"--\n" +
"ALTER TABLE `registro_bajas`\n" +
"  ADD PRIMARY KEY (`rb_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `tipo_pago`\n" +
"--\n" +
"ALTER TABLE `tipo_pago`\n" +
"  ADD PRIMARY KEY (`tp_id`);\n" +
"\n" +
"--\n" +
"-- Indices de la tabla `usuario`\n" +
"--\n" +
"ALTER TABLE `usuario`\n" +
"  ADD PRIMARY KEY (`us_id`);\n" +
"COMMIT;\n" +
"\n" +
"/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;\n" +
"/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;\n" +
"/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;";
    }
}
