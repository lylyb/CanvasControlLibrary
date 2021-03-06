/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.canvascontrollibrary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gilgamesh
 */
    public class CCLBarGraphProps
    {
        public String CanvasID;
        public String WindowID;
        public String X;
        public String Y;
        public String Width;
        public String Height;
        public List<Object> Data;
        public String MaxValue;
        public String NumMarksY;
        public String Title;
        public String TitleTextColor;
        public String TitleTextHeight;
        public String TitleTextFontString;
        public String BarWidth;
        public List<Object> BarLabelsWithBoundingBoxes;
        public String H;
        public String AxisLabelsTextHeight;
        public String AxisLabelsTextFontString;
        public String AxisLabelsTextColor;
        public String MarginLeft;
        public String GapBetweenBars;
        public String BarClickFunction;
        public String AlreadyUnregisteredAnimation;
        public String HasLegend;
        public String MarginRight;
        public Object Tag;

        CCLBarGraphProps()
        {
            Data = new ArrayList<Object>();
            BarLabelsWithBoundingBoxes = new ArrayList<Object>();
        }
    }
