<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the web site, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wp' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'D(0ULWC21+F `.%pWm:]iK/z~wkqfbC&j`MnyJ%vi7$-=Op7mygJa-,#]R~)c0J-' );
define( 'SECURE_AUTH_KEY',  'u[u&*7%DBb`ZMPQx.e2Q#&>ID>o-#Oe.*U^PlRlr|=mzQOEkpi|Xj_c0sV/#(1ji' );
define( 'LOGGED_IN_KEY',    '=;W[}}{_.#S,e|iumETcri}kGB{kHSi:G3 G+:@`skOiXOEPoc%++U5H%f#ok/ B' );
define( 'NONCE_KEY',        '* _ 7s2!`0%jm9+)7=Q!z=9Xmfv81rW;XhN[pIVNQkiDl3lUQBJ86m`JhpCCVKK6' );
define( 'AUTH_SALT',        'qYf^_>?UCeo^k[O<2zs@%=}e%?sys-M7}o>=DpAETk:;,PaK/;?t==dcn9h(D:s8' );
define( 'SECURE_AUTH_SALT', '(d[].%11Rt,fM2hV5tIqI?j_~&E|Kt+] Nw*Fa<4Pu-G.l0E[DUK[<:,5`I(u*/ ' );
define( 'LOGGED_IN_SALT',   '|(Wi58xvW7lE:Z_QG@U,n|9`tY6UH-qtiLL/N0fI[SQ/,q@.#YQwuuc9jN23/JV]' );
define( 'NONCE_SALT',       'o1Sn%@CXNzP:2N!qSq)YDkg?|-paU2qkKt|ZJBMafOKpr](j_)LgnsgeopUBPCYZ' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
