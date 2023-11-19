package com.udemy.drawingappintro

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.graphics.Path
/*
To draw something, you need 4 things, 1. bitmap holds the pixels,
2. canvas to hold the draw calls and retain everything into the bitmap, 3. drawing primitive and
 4. a paint to describe the colors, style for the drawing
 */
// inherit from View since we want the android system to treat a view as a View(ui component
class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    // drawing path
    private lateinit var drawPath: FingerPath

    // defines what to draw
    private lateinit var canvasPaint: Paint

    //defines how to draw
    private lateinit var drawPaint: Paint

    private var color = Color.BLACK
    private lateinit var canvas: Canvas
    private lateinit var canvasBitmap: Bitmap
    private var brushSize: Float = 0.toFloat()

    init {
        setUpDrawing()
    }
private fun setUpDrawing(){
drawPaint = Paint()
    drawPath = FingerPath(color, brushSize)
    drawPaint.color = color
    drawPaint.style = Paint.Style.STROKE
    drawPaint.strokeJoin = Paint.Join.ROUND
    drawPaint.strokeCap = Paint.Cap.ROUND
    brushSize = 20.toFloat()
}
    internal inner class FingerPath(val color: Int, val brushThickness: Float) : Path()
}