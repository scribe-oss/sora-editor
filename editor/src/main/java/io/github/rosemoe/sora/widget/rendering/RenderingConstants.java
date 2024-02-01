/*
 *    sora-editor - the awesome code editor for Android
 *    https://github.com/Rosemoe/sora-editor
 *    Copyright (C) 2020-2024  Rosemoe
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 *
 *     Please contact Rosemoe by email 2073412493@qq.com if you need
 *     additional information or have any questions
 */
package io.github.rosemoe.sora.widget.rendering;

/**
 * Holds some shared constants in editor graphics properties
 *
 * @author Rosemoe
 */
public class RenderingConstants {

    /**
     * Text skew X applied in editor
     */
    public final static float TEXT_SKEW_X = -0.2f;

    /**
     * Edge radius multiplier for editor round rectangles
     */
    public final static float ROUND_RECT_FACTOR = 0.13f;

    /**
     * Edge radius multiplier for editor bubbles
     */
    public final static float ROUND_BUBBLE_FACTOR = 0.5f;

    /**
     * Shadow radius maximum for pinned line number, in dp unit
     */
    public final static float DIVIDER_SHADOW_MAX_RADIUS_DIP = 8f;

}