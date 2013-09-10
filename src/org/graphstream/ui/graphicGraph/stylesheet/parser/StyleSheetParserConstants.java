/* Generated By:JavaCC: Do not edit this line. StyleSheetParserConstants.java */
/*
 * Copyright 2006 - 2012
 *     Stefan Balev     <stefan.balev@graphstream-project.org>
 *     Julien Baudry	<julien.baudry@graphstream-project.org>
 *     Antoine Dutot	<antoine.dutot@graphstream-project.org>
 *     Yoann Pigné		<yoann.pigne@graphstream-project.org>
 *     Guilhelm Savin	<guilhelm.savin@graphstream-project.org>
 * 
 * This file is part of GraphStream <http://graphstream-project.org>.
 * 
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */
package org.graphstream.ui.graphicGraph.stylesheet.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface StyleSheetParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int EOL = 5;
  /** RegularExpression Id. */
  int DIGIT = 6;
  /** RegularExpression Id. */
  int HEXDIGIT = 7;
  /** RegularExpression Id. */
  int UNITS = 8;
  /** RegularExpression Id. */
  int DOT = 9;
  /** RegularExpression Id. */
  int LBRACE = 10;
  /** RegularExpression Id. */
  int RBRACE = 11;
  /** RegularExpression Id. */
  int LPAREN = 12;
  /** RegularExpression Id. */
  int RPAREN = 13;
  /** RegularExpression Id. */
  int SHARP = 14;
  /** RegularExpression Id. */
  int COLON = 15;
  /** RegularExpression Id. */
  int SEMICOLON = 16;
  /** RegularExpression Id. */
  int COMA = 17;
  /** RegularExpression Id. */
  int RGBA = 18;
  /** RegularExpression Id. */
  int RGB = 19;
  /** RegularExpression Id. */
  int HTMLCOLOR = 20;
  /** RegularExpression Id. */
  int REAL = 21;
  /** RegularExpression Id. */
  int STRING = 22;
  /** RegularExpression Id. */
  int URL = 23;
  /** RegularExpression Id. */
  int GRAPH = 24;
  /** RegularExpression Id. */
  int EDGE = 25;
  /** RegularExpression Id. */
  int NODE = 26;
  /** RegularExpression Id. */
  int SPRITE = 27;
  /** RegularExpression Id. */
  int FILLMODE = 28;
  /** RegularExpression Id. */
  int FILLCOLOR = 29;
  /** RegularExpression Id. */
  int FILLIMAGE = 30;
  /** RegularExpression Id. */
  int STROKEMODE = 31;
  /** RegularExpression Id. */
  int STROKECOLOR = 32;
  /** RegularExpression Id. */
  int STROKEWIDTH = 33;
  /** RegularExpression Id. */
  int SHADOWMODE = 34;
  /** RegularExpression Id. */
  int SHADOWCOLOR = 35;
  /** RegularExpression Id. */
  int SHADOWWIDTH = 36;
  /** RegularExpression Id. */
  int SHADOWOFFSET = 37;
  /** RegularExpression Id. */
  int TEXTMODE = 38;
  /** RegularExpression Id. */
  int TEXTCOLOR = 39;
  /** RegularExpression Id. */
  int TEXTSTYLE = 40;
  /** RegularExpression Id. */
  int TEXTFONT = 41;
  /** RegularExpression Id. */
  int TEXTSIZE = 42;
  /** RegularExpression Id. */
  int TEXTVISIBILITYMODE = 43;
  /** RegularExpression Id. */
  int TEXTVISIBILITY = 44;
  /** RegularExpression Id. */
  int TEXTBACKGROUNDMODE = 45;
  /** RegularExpression Id. */
  int TEXTBACKGROUNDCOLOR = 46;
  /** RegularExpression Id. */
  int TEXTOFFSET = 47;
  /** RegularExpression Id. */
  int TEXTPADDING = 48;
  /** RegularExpression Id. */
  int ICONMODE = 49;
  /** RegularExpression Id. */
  int ICON = 50;
  /** RegularExpression Id. */
  int PADDING = 51;
  /** RegularExpression Id. */
  int ZINDEX = 52;
  /** RegularExpression Id. */
  int VISIBILITYMODE = 53;
  /** RegularExpression Id. */
  int VISIBILITY = 54;
  /** RegularExpression Id. */
  int SHAPE = 55;
  /** RegularExpression Id. */
  int SIZE = 56;
  /** RegularExpression Id. */
  int SIZEMODE = 57;
  /** RegularExpression Id. */
  int SHAPEPOINTS = 58;
  /** RegularExpression Id. */
  int TEXTALIGNMENT = 59;
  /** RegularExpression Id. */
  int JCOMPONENT = 60;
  /** RegularExpression Id. */
  int ARROWIMGURL = 61;
  /** RegularExpression Id. */
  int ARROWSIZE = 62;
  /** RegularExpression Id. */
  int ARROWSHAPE = 63;
  /** RegularExpression Id. */
  int SPRITEORIENT = 64;
  /** RegularExpression Id. */
  int CANVASCOLOR = 65;
  /** RegularExpression Id. */
  int PLAIN = 66;
  /** RegularExpression Id. */
  int DYNPLAIN = 67;
  /** RegularExpression Id. */
  int DYNSIZE = 68;
  /** RegularExpression Id. */
  int DYNICON = 69;
  /** RegularExpression Id. */
  int DASHES = 70;
  /** RegularExpression Id. */
  int DOTS = 71;
  /** RegularExpression Id. */
  int DOUBLE = 72;
  /** RegularExpression Id. */
  int GRADIENTDIAGONAL1 = 73;
  /** RegularExpression Id. */
  int GRADIENTDIAGONAL2 = 74;
  /** RegularExpression Id. */
  int GRADIENTHORIZONTAL = 75;
  /** RegularExpression Id. */
  int GRADIENTRADIAL = 76;
  /** RegularExpression Id. */
  int GRADIENTVERTICAL = 77;
  /** RegularExpression Id. */
  int HIDDEN = 78;
  /** RegularExpression Id. */
  int IMAGETILED = 79;
  /** RegularExpression Id. */
  int IMAGESCALED = 80;
  /** RegularExpression Id. */
  int IMAGESCALEDRATIOMAX = 81;
  /** RegularExpression Id. */
  int IMAGESCALEDRATIOMIN = 82;
  /** RegularExpression Id. */
  int NONE = 83;
  /** RegularExpression Id. */
  int NORMAL = 84;
  /** RegularExpression Id. */
  int TRUNCATED = 85;
  /** RegularExpression Id. */
  int ZOOMRANGE = 86;
  /** RegularExpression Id. */
  int ATZOOM = 87;
  /** RegularExpression Id. */
  int UNDERZOOM = 88;
  /** RegularExpression Id. */
  int OVERZOOM = 89;
  /** RegularExpression Id. */
  int ZOOMS = 90;
  /** RegularExpression Id. */
  int FIT = 91;
  /** RegularExpression Id. */
  int BOLD = 92;
  /** RegularExpression Id. */
  int BOLD_ITALIC = 93;
  /** RegularExpression Id. */
  int ITALIC = 94;
  /** RegularExpression Id. */
  int ALONG = 95;
  /** RegularExpression Id. */
  int ATLEFT = 96;
  /** RegularExpression Id. */
  int ATRIGHT = 97;
  /** RegularExpression Id. */
  int CENTER = 98;
  /** RegularExpression Id. */
  int LEFT = 99;
  /** RegularExpression Id. */
  int RIGHT = 100;
  /** RegularExpression Id. */
  int UNDER = 101;
  /** RegularExpression Id. */
  int ABOVE = 102;
  /** RegularExpression Id. */
  int JUSTIFY = 103;
  /** RegularExpression Id. */
  int CIRCLE = 104;
  /** RegularExpression Id. */
  int TRIANGLE = 105;
  /** RegularExpression Id. */
  int FREEPLANE = 106;
  /** RegularExpression Id. */
  int TEXTBOX = 107;
  /** RegularExpression Id. */
  int TEXTROUNDEDBOX = 108;
  /** RegularExpression Id. */
  int TEXTCIRCLE = 109;
  /** RegularExpression Id. */
  int TEXTDIAMOND = 110;
  /** RegularExpression Id. */
  int TEXTPARAGRAPH = 111;
  /** RegularExpression Id. */
  int BOX = 112;
  /** RegularExpression Id. */
  int ROUNDEDBOX = 113;
  /** RegularExpression Id. */
  int CROSS = 114;
  /** RegularExpression Id. */
  int DIAMOND = 115;
  /** RegularExpression Id. */
  int POLYGON = 116;
  /** RegularExpression Id. */
  int BUTTON = 117;
  /** RegularExpression Id. */
  int TEXTFIELD = 118;
  /** RegularExpression Id. */
  int PANEL = 119;
  /** RegularExpression Id. */
  int LINE = 120;
  /** RegularExpression Id. */
  int POLYLINE = 121;
  /** RegularExpression Id. */
  int POLYLINESCALED = 122;
  /** RegularExpression Id. */
  int ANGLE = 123;
  /** RegularExpression Id. */
  int CUBICCURVE = 124;
  /** RegularExpression Id. */
  int BLOB = 125;
  /** RegularExpression Id. */
  int SQUARELINE = 126;
  /** RegularExpression Id. */
  int LSQUARELINE = 127;
  /** RegularExpression Id. */
  int HSQUARELINE = 128;
  /** RegularExpression Id. */
  int VSQUARELINE = 129;
  /** RegularExpression Id. */
  int ARROW = 130;
  /** RegularExpression Id. */
  int FLOW = 131;
  /** RegularExpression Id. */
  int PIECHART = 132;
  /** RegularExpression Id. */
  int IMAGE = 133;
  /** RegularExpression Id. */
  int IMAGES = 134;
  /** RegularExpression Id. */
  int FROM = 135;
  /** RegularExpression Id. */
  int NODE0 = 136;
  /** RegularExpression Id. */
  int TO = 137;
  /** RegularExpression Id. */
  int NODE1 = 138;
  /** RegularExpression Id. */
  int PROJECTION = 139;
  /** RegularExpression Id. */
  int CLICKED = 140;
  /** RegularExpression Id. */
  int SELECTED = 141;
  /** RegularExpression Id. */
  int IDENTIFIER = 142;
  /** RegularExpression Id. */
  int COMMENT = 143;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "<EOL>",
    "<DIGIT>",
    "<HEXDIGIT>",
    "<UNITS>",
    "\".\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"#\"",
    "\":\"",
    "\";\"",
    "\",\"",
    "\"rgba\"",
    "\"rgb\"",
    "<HTMLCOLOR>",
    "<REAL>",
    "<STRING>",
    "\"url\"",
    "\"graph\"",
    "\"edge\"",
    "\"node\"",
    "\"sprite\"",
    "\"fill-mode\"",
    "\"fill-color\"",
    "\"fill-image\"",
    "\"stroke-mode\"",
    "\"stroke-color\"",
    "\"stroke-width\"",
    "\"shadow-mode\"",
    "\"shadow-color\"",
    "\"shadow-width\"",
    "\"shadow-offset\"",
    "\"text-mode\"",
    "\"text-color\"",
    "\"text-style\"",
    "\"text-font\"",
    "\"text-size\"",
    "\"text-visibility-mode\"",
    "\"text-visibility\"",
    "\"text-background-mode\"",
    "\"text-background-color\"",
    "\"text-offset\"",
    "\"text-padding\"",
    "\"icon-mode\"",
    "\"icon\"",
    "\"padding\"",
    "\"z-index\"",
    "\"visibility-mode\"",
    "\"visibility\"",
    "\"shape\"",
    "\"size\"",
    "\"size-mode\"",
    "\"shape-points\"",
    "\"text-alignment\"",
    "\"jcomponent\"",
    "\"arrow-image\"",
    "\"arrow-size\"",
    "\"arrow-shape\"",
    "\"sprite-orientation\"",
    "\"canvas-color\"",
    "\"plain\"",
    "\"dyn-plain\"",
    "\"dyn-size\"",
    "\"dyn-icon\"",
    "\"dashes\"",
    "\"dots\"",
    "\"double\"",
    "\"gradient-diagonal1\"",
    "\"gradient-diagonal2\"",
    "\"gradient-horizontal\"",
    "\"gradient-radial\"",
    "\"gradient-vertical\"",
    "\"hidden\"",
    "\"image-tiled\"",
    "\"image-scaled\"",
    "\"image-scaled-ratio-max\"",
    "\"image-scaled-ratio-min\"",
    "\"none\"",
    "\"normal\"",
    "\"truncated\"",
    "\"zoom-range\"",
    "\"at-zoom\"",
    "\"under-zoom\"",
    "\"over-zoom\"",
    "\"zooms\"",
    "\"fit\"",
    "\"bold\"",
    "\"bold-italic\"",
    "\"italic\"",
    "\"along\"",
    "\"at-left\"",
    "\"at-right\"",
    "\"center\"",
    "\"left\"",
    "\"right\"",
    "\"under\"",
    "\"above\"",
    "\"justify\"",
    "\"circle\"",
    "\"triangle\"",
    "\"freeplane\"",
    "\"text-box\"",
    "\"text-rounded-box\"",
    "\"text-circle\"",
    "\"text-diamond\"",
    "\"text-paragraph\"",
    "\"box\"",
    "\"rounded-box\"",
    "\"cross\"",
    "\"diamond\"",
    "\"polygon\"",
    "\"button\"",
    "\"text-field\"",
    "\"panel\"",
    "\"line\"",
    "\"polyline\"",
    "\"polyline-scaled\"",
    "\"angle\"",
    "\"cubic-curve\"",
    "\"blob\"",
    "\"square-line\"",
    "\"L-square-line\"",
    "\"horizontal-square-line\"",
    "\"vertical-square-line\"",
    "\"arrow\"",
    "\"flow\"",
    "\"pie-chart\"",
    "\"image\"",
    "\"images\"",
    "\"from\"",
    "\"node0\"",
    "\"to\"",
    "\"node1\"",
    "\"projection\"",
    "\"clicked\"",
    "\"selected\"",
    "<IDENTIFIER>",
    "<COMMENT>",
  };

}
