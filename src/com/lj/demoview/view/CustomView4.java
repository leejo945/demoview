 
package com.lj.demoview.view;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewDebug.IntToString;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class CustomView4 extends View {

	public CustomView4(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomView4(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CustomView4(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}
    @Override
    protected void onDraw(Canvas canvas) {
    	// TODO Auto-generated method stub
    	super.onDraw(canvas);
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void initializeFadingEdge(TypedArray a) {
		// TODO Auto-generated method stub
		super.initializeFadingEdge(a);
	}

	@Override
	public int getVerticalFadingEdgeLength() {
		// TODO Auto-generated method stub
		return super.getVerticalFadingEdgeLength();
	}

	@Override
	public void setFadingEdgeLength(int length) {
		// TODO Auto-generated method stub
		super.setFadingEdgeLength(length);
	}

	@Override
	public int getHorizontalFadingEdgeLength() {
		// TODO Auto-generated method stub
		return super.getHorizontalFadingEdgeLength();
	}

	@Override
	public int getVerticalScrollbarWidth() {
		// TODO Auto-generated method stub
		return super.getVerticalScrollbarWidth();
	}

	@Override
	protected int getHorizontalScrollbarHeight() {
		// TODO Auto-generated method stub
		return super.getHorizontalScrollbarHeight();
	}

	@Override
	protected void initializeScrollbars(TypedArray a) {
		// TODO Auto-generated method stub
		super.initializeScrollbars(a);
	}

	@Override
	public void setVerticalScrollbarPosition(int position) {
		// TODO Auto-generated method stub
		super.setVerticalScrollbarPosition(position);
	}

	@Override
	public int getVerticalScrollbarPosition() {
		// TODO Auto-generated method stub
		return super.getVerticalScrollbarPosition();
	}

	@Override
	public void setOnFocusChangeListener(OnFocusChangeListener l) {
		// TODO Auto-generated method stub
		super.setOnFocusChangeListener(l);
	}

	@Override
	public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
		// TODO Auto-generated method stub
		super.addOnLayoutChangeListener(listener);
	}

	@Override
	public void removeOnLayoutChangeListener(OnLayoutChangeListener listener) {
		// TODO Auto-generated method stub
		super.removeOnLayoutChangeListener(listener);
	}

	@Override
	public void addOnAttachStateChangeListener(
			OnAttachStateChangeListener listener) {
		// TODO Auto-generated method stub
		super.addOnAttachStateChangeListener(listener);
	}

	@Override
	public void removeOnAttachStateChangeListener(
			OnAttachStateChangeListener listener) {
		// TODO Auto-generated method stub
		super.removeOnAttachStateChangeListener(listener);
	}

	@Override
	public OnFocusChangeListener getOnFocusChangeListener() {
		// TODO Auto-generated method stub
		return super.getOnFocusChangeListener();
	}

	@Override
	public void setOnClickListener(OnClickListener l) {
		// TODO Auto-generated method stub
		super.setOnClickListener(l);
	}

	@Override
	public boolean hasOnClickListeners() {
		// TODO Auto-generated method stub
		return super.hasOnClickListeners();
	}

	@Override
	public void setOnLongClickListener(OnLongClickListener l) {
		// TODO Auto-generated method stub
		super.setOnLongClickListener(l);
	}

	@Override
	public void setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
		// TODO Auto-generated method stub
		super.setOnCreateContextMenuListener(l);
	}

	@Override
	public boolean performClick() {
		// TODO Auto-generated method stub
		return super.performClick();
	}

	@Override
	public boolean callOnClick() {
		// TODO Auto-generated method stub
		return super.callOnClick();
	}

	@Override
	public boolean performLongClick() {
		// TODO Auto-generated method stub
		return super.performLongClick();
	}

	@Override
	public boolean showContextMenu() {
		// TODO Auto-generated method stub
		return super.showContextMenu();
	}

	@Override
	public ActionMode startActionMode(Callback callback) {
		// TODO Auto-generated method stub
		return super.startActionMode(callback);
	}

	@Override
	public void setOnKeyListener(OnKeyListener l) {
		// TODO Auto-generated method stub
		super.setOnKeyListener(l);
	}

	@Override
	public void setOnTouchListener(OnTouchListener l) {
		// TODO Auto-generated method stub
		super.setOnTouchListener(l);
	}

	@Override
	public void setOnGenericMotionListener(OnGenericMotionListener l) {
		// TODO Auto-generated method stub
		super.setOnGenericMotionListener(l);
	}

	@Override
	public void setOnHoverListener(OnHoverListener l) {
		// TODO Auto-generated method stub
		super.setOnHoverListener(l);
	}

	@Override
	public void setOnDragListener(OnDragListener l) {
		// TODO Auto-generated method stub
		super.setOnDragListener(l);
	}

	@Override
	public boolean requestRectangleOnScreen(Rect rectangle) {
		// TODO Auto-generated method stub
		return super.requestRectangleOnScreen(rectangle);
	}

	@Override
	public boolean requestRectangleOnScreen(Rect rectangle, boolean immediate) {
		// TODO Auto-generated method stub
		return super.requestRectangleOnScreen(rectangle, immediate);
	}

	@Override
	public void clearFocus() {
		// TODO Auto-generated method stub
		super.clearFocus();
	}

	@Override
	@ExportedProperty(category = "focus")
	public boolean hasFocus() {
		// TODO Auto-generated method stub
		return super.hasFocus();
	}

	@Override
	public boolean hasFocusable() {
		// TODO Auto-generated method stub
		return super.hasFocusable();
	}

	@Override
	protected void onFocusChanged(boolean gainFocus, int direction,
			Rect previouslyFocusedRect) {
		// TODO Auto-generated method stub
		super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
	}

	@Override
	public void sendAccessibilityEvent(int eventType) {
		// TODO Auto-generated method stub
		super.sendAccessibilityEvent(eventType);
	}

	@Override
	public void announceForAccessibility(CharSequence text) {
		// TODO Auto-generated method stub
		super.announceForAccessibility(text);
	}

	@Override
	public void sendAccessibilityEventUnchecked(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		super.sendAccessibilityEventUnchecked(event);
	}

	@Override
	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchPopulateAccessibilityEvent(event);
	}

	@Override
	public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		super.onPopulateAccessibilityEvent(event);
	}

	@Override
	public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		super.onInitializeAccessibilityEvent(event);
	}

	@Override
	public AccessibilityNodeInfo createAccessibilityNodeInfo() {
		// TODO Auto-generated method stub
		return super.createAccessibilityNodeInfo();
	}

	@Override
	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
		// TODO Auto-generated method stub
		super.onInitializeAccessibilityNodeInfo(info);
	}

	@Override
	public void setAccessibilityDelegate(AccessibilityDelegate delegate) {
		// TODO Auto-generated method stub
		super.setAccessibilityDelegate(delegate);
	}

	@Override
	public AccessibilityNodeProvider getAccessibilityNodeProvider() {
		// TODO Auto-generated method stub
		return super.getAccessibilityNodeProvider();
	}

	@Override
	@ExportedProperty(category = "accessibility")
	public CharSequence getContentDescription() {
		// TODO Auto-generated method stub
		return super.getContentDescription();
	}

	@Override
	public void setContentDescription(CharSequence contentDescription) {
		// TODO Auto-generated method stub
		super.setContentDescription(contentDescription);
	}

	@Override
	@ExportedProperty(category = "accessibility")
	public int getLabelFor() {
		// TODO Auto-generated method stub
		return super.getLabelFor();
	}

	@Override
	public void setLabelFor(int id) {
		// TODO Auto-generated method stub
		super.setLabelFor(id);
	}

	@Override
	@ExportedProperty(category = "focus")
	public boolean isFocused() {
		// TODO Auto-generated method stub
		return super.isFocused();
	}

	@Override
	public View findFocus() {
		// TODO Auto-generated method stub
		return super.findFocus();
	}

	@Override
	public boolean isScrollContainer() {
		// TODO Auto-generated method stub
		return super.isScrollContainer();
	}

	@Override
	public void setScrollContainer(boolean isScrollContainer) {
		// TODO Auto-generated method stub
		super.setScrollContainer(isScrollContainer);
	}

	@Override
	public int getDrawingCacheQuality() {
		// TODO Auto-generated method stub
		return super.getDrawingCacheQuality();
	}

	@Override
	public void setDrawingCacheQuality(int quality) {
		// TODO Auto-generated method stub
		super.setDrawingCacheQuality(quality);
	}

	@Override
	public boolean getKeepScreenOn() {
		// TODO Auto-generated method stub
		return super.getKeepScreenOn();
	}

	@Override
	public void setKeepScreenOn(boolean keepScreenOn) {
		// TODO Auto-generated method stub
		super.setKeepScreenOn(keepScreenOn);
	}

	@Override
	public int getNextFocusLeftId() {
		// TODO Auto-generated method stub
		return super.getNextFocusLeftId();
	}

	@Override
	public void setNextFocusLeftId(int nextFocusLeftId) {
		// TODO Auto-generated method stub
		super.setNextFocusLeftId(nextFocusLeftId);
	}

	@Override
	public int getNextFocusRightId() {
		// TODO Auto-generated method stub
		return super.getNextFocusRightId();
	}

	@Override
	public void setNextFocusRightId(int nextFocusRightId) {
		// TODO Auto-generated method stub
		super.setNextFocusRightId(nextFocusRightId);
	}

	@Override
	public int getNextFocusUpId() {
		// TODO Auto-generated method stub
		return super.getNextFocusUpId();
	}

	@Override
	public void setNextFocusUpId(int nextFocusUpId) {
		// TODO Auto-generated method stub
		super.setNextFocusUpId(nextFocusUpId);
	}

	@Override
	public int getNextFocusDownId() {
		// TODO Auto-generated method stub
		return super.getNextFocusDownId();
	}

	@Override
	public void setNextFocusDownId(int nextFocusDownId) {
		// TODO Auto-generated method stub
		super.setNextFocusDownId(nextFocusDownId);
	}

	@Override
	public int getNextFocusForwardId() {
		// TODO Auto-generated method stub
		return super.getNextFocusForwardId();
	}

	@Override
	public void setNextFocusForwardId(int nextFocusForwardId) {
		// TODO Auto-generated method stub
		super.setNextFocusForwardId(nextFocusForwardId);
	}

	@Override
	public boolean isShown() {
		// TODO Auto-generated method stub
		return super.isShown();
	}

	@Override
	protected boolean fitSystemWindows(Rect insets) {
		// TODO Auto-generated method stub
		return super.fitSystemWindows(insets);
	}

	@Override
	public void setFitsSystemWindows(boolean fitSystemWindows) {
		// TODO Auto-generated method stub
		super.setFitsSystemWindows(fitSystemWindows);
	}

	@Override
	public boolean getFitsSystemWindows() {
		// TODO Auto-generated method stub
		return super.getFitsSystemWindows();
	}

	@Override
	public void requestFitSystemWindows() {
		// TODO Auto-generated method stub
		super.requestFitSystemWindows();
	}

	@Override
	@ExportedProperty(mapping = { @IntToString(from = 0, to = "VISIBLE"),
			@IntToString(from = 4, to = "INVISIBLE"),
			@IntToString(from = 8, to = "GONE") })
	public int getVisibility() {
		// TODO Auto-generated method stub
		return super.getVisibility();
	}

	@Override
	public void setVisibility(int visibility) {
		// TODO Auto-generated method stub
		super.setVisibility(visibility);
	}

	@Override
	@ExportedProperty
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return super.isEnabled();
	}

	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setEnabled(enabled);
	}

	@Override
	public void setFocusable(boolean focusable) {
		// TODO Auto-generated method stub
		super.setFocusable(focusable);
	}

	@Override
	public void setFocusableInTouchMode(boolean focusableInTouchMode) {
		// TODO Auto-generated method stub
		super.setFocusableInTouchMode(focusableInTouchMode);
	}

	@Override
	public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
		// TODO Auto-generated method stub
		super.setSoundEffectsEnabled(soundEffectsEnabled);
	}

	@Override
	@ExportedProperty
	public boolean isSoundEffectsEnabled() {
		// TODO Auto-generated method stub
		return super.isSoundEffectsEnabled();
	}

	@Override
	public void setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
		// TODO Auto-generated method stub
		super.setHapticFeedbackEnabled(hapticFeedbackEnabled);
	}

	@Override
	@ExportedProperty
	public boolean isHapticFeedbackEnabled() {
		// TODO Auto-generated method stub
		return super.isHapticFeedbackEnabled();
	}

	@Override
	public void setLayoutDirection(int layoutDirection) {
		// TODO Auto-generated method stub
		super.setLayoutDirection(layoutDirection);
	}

	@Override
	@ExportedProperty(category = "layout", mapping = {
			@IntToString(from = 0, to = "RESOLVED_DIRECTION_LTR"),
			@IntToString(from = 1, to = "RESOLVED_DIRECTION_RTL") })
	public int getLayoutDirection() {
		// TODO Auto-generated method stub
		return super.getLayoutDirection();
	}

	@Override
	@ExportedProperty(category = "layout")
	public boolean hasTransientState() {
		// TODO Auto-generated method stub
		return super.hasTransientState();
	}

	@Override
	public void setHasTransientState(boolean hasTransientState) {
		// TODO Auto-generated method stub
		super.setHasTransientState(hasTransientState);
	}

	@Override
	public boolean isAttachedToWindow() {
		// TODO Auto-generated method stub
		return super.isAttachedToWindow();
	}

	@Override
	public boolean isLaidOut() {
		// TODO Auto-generated method stub
		return super.isLaidOut();
	}

	@Override
	public void setWillNotDraw(boolean willNotDraw) {
		// TODO Auto-generated method stub
		super.setWillNotDraw(willNotDraw);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public boolean willNotDraw() {
		// TODO Auto-generated method stub
		return super.willNotDraw();
	}

	@Override
	public void setWillNotCacheDrawing(boolean willNotCacheDrawing) {
		// TODO Auto-generated method stub
		super.setWillNotCacheDrawing(willNotCacheDrawing);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public boolean willNotCacheDrawing() {
		// TODO Auto-generated method stub
		return super.willNotCacheDrawing();
	}

	@Override
	@ExportedProperty
	public boolean isClickable() {
		// TODO Auto-generated method stub
		return super.isClickable();
	}

	@Override
	public void setClickable(boolean clickable) {
		// TODO Auto-generated method stub
		super.setClickable(clickable);
	}

	@Override
	public boolean isLongClickable() {
		// TODO Auto-generated method stub
		return super.isLongClickable();
	}

	@Override
	public void setLongClickable(boolean longClickable) {
		// TODO Auto-generated method stub
		super.setLongClickable(longClickable);
	}

	@Override
	public void setPressed(boolean pressed) {
		// TODO Auto-generated method stub
		super.setPressed(pressed);
	}

	@Override
	protected void dispatchSetPressed(boolean pressed) {
		// TODO Auto-generated method stub
		super.dispatchSetPressed(pressed);
	}

	@Override
	public boolean isPressed() {
		// TODO Auto-generated method stub
		return super.isPressed();
	}

	@Override
	public boolean isSaveEnabled() {
		// TODO Auto-generated method stub
		return super.isSaveEnabled();
	}

	@Override
	public void setSaveEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setSaveEnabled(enabled);
	}

	@Override
	@ExportedProperty
	public boolean getFilterTouchesWhenObscured() {
		// TODO Auto-generated method stub
		return super.getFilterTouchesWhenObscured();
	}

	@Override
	public void setFilterTouchesWhenObscured(boolean enabled) {
		// TODO Auto-generated method stub
		super.setFilterTouchesWhenObscured(enabled);
	}

	@Override
	public boolean isSaveFromParentEnabled() {
		// TODO Auto-generated method stub
		return super.isSaveFromParentEnabled();
	}

	@Override
	public void setSaveFromParentEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setSaveFromParentEnabled(enabled);
	}

	@Override
	public View focusSearch(int direction) {
		// TODO Auto-generated method stub
		return super.focusSearch(direction);
	}

	@Override
	public boolean dispatchUnhandledMove(View focused, int direction) {
		// TODO Auto-generated method stub
		return super.dispatchUnhandledMove(focused, direction);
	}

	@Override
	public ArrayList<View> getFocusables(int direction) {
		// TODO Auto-generated method stub
		return super.getFocusables(direction);
	}

	@Override
	public void addFocusables(ArrayList<View> views, int direction) {
		// TODO Auto-generated method stub
		super.addFocusables(views, direction);
	}

	@Override
	public void addFocusables(ArrayList<View> views, int direction,
			int focusableMode) {
		// TODO Auto-generated method stub
		super.addFocusables(views, direction, focusableMode);
	}

	@Override
	public void findViewsWithText(ArrayList<View> outViews,
			CharSequence searched, int flags) {
		// TODO Auto-generated method stub
		super.findViewsWithText(outViews, searched, flags);
	}

	@Override
	public ArrayList<View> getTouchables() {
		// TODO Auto-generated method stub
		return super.getTouchables();
	}

	@Override
	public void addTouchables(ArrayList<View> views) {
		// TODO Auto-generated method stub
		super.addTouchables(views);
	}

	@Override
	public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
		// TODO Auto-generated method stub
		return super.requestFocus(direction, previouslyFocusedRect);
	}

	@Override
	@ExportedProperty(category = "accessibility", mapping = {
			@IntToString(from = 0, to = "auto"),
			@IntToString(from = 1, to = "yes"),
			@IntToString(from = 2, to = "no"),
			@IntToString(from = 4, to = "noHideDescendants") })
	public int getImportantForAccessibility() {
		// TODO Auto-generated method stub
		return super.getImportantForAccessibility();
	}

	@Override
	public void setAccessibilityLiveRegion(int mode) {
		// TODO Auto-generated method stub
		super.setAccessibilityLiveRegion(mode);
	}

	@Override
	public int getAccessibilityLiveRegion() {
		// TODO Auto-generated method stub
		return super.getAccessibilityLiveRegion();
	}

	@Override
	public void setImportantForAccessibility(int mode) {
		// TODO Auto-generated method stub
		super.setImportantForAccessibility(mode);
	}

	@Override
	public ViewParent getParentForAccessibility() {
		// TODO Auto-generated method stub
		return super.getParentForAccessibility();
	}

	@Override
	public void addChildrenForAccessibility(ArrayList<View> children) {
		// TODO Auto-generated method stub
		super.addChildrenForAccessibility(children);
	}

	@Override
	public boolean performAccessibilityAction(int action, Bundle arguments) {
		// TODO Auto-generated method stub
		return super.performAccessibilityAction(action, arguments);
	}

	@Override
	public void onStartTemporaryDetach() {
		// TODO Auto-generated method stub
		super.onStartTemporaryDetach();
	}

	@Override
	public void onFinishTemporaryDetach() {
		// TODO Auto-generated method stub
		super.onFinishTemporaryDetach();
	}

	@Override
	public DispatcherState getKeyDispatcherState() {
		// TODO Auto-generated method stub
		return super.getKeyDispatcherState();
	}

	@Override
	public boolean dispatchKeyEventPreIme(KeyEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchKeyEventPreIme(event);
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchKeyEvent(event);
	}

	@Override
	public boolean dispatchKeyShortcutEvent(KeyEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchKeyShortcutEvent(event);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchTouchEvent(event);
	}

	@Override
	public boolean onFilterTouchEventForSecurity(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onFilterTouchEventForSecurity(event);
	}

	@Override
	public boolean dispatchTrackballEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchTrackballEvent(event);
	}

	@Override
	public boolean dispatchGenericMotionEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchGenericMotionEvent(event);
	}

	@Override
	protected boolean dispatchHoverEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchHoverEvent(event);
	}

	@Override
	protected boolean dispatchGenericPointerEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchGenericPointerEvent(event);
	}

	@Override
	protected boolean dispatchGenericFocusedEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchGenericFocusedEvent(event);
	}

	@Override
	public void dispatchWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		super.dispatchWindowFocusChanged(hasFocus);
	}

	@Override
	public void onWindowFocusChanged(boolean hasWindowFocus) {
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasWindowFocus);
	}

	@Override
	public boolean hasWindowFocus() {
		// TODO Auto-generated method stub
		return super.hasWindowFocus();
	}

	@Override
	protected void dispatchVisibilityChanged(View changedView, int visibility) {
		// TODO Auto-generated method stub
		super.dispatchVisibilityChanged(changedView, visibility);
	}

	@Override
	protected void onVisibilityChanged(View changedView, int visibility) {
		// TODO Auto-generated method stub
		super.onVisibilityChanged(changedView, visibility);
	}

	@Override
	public void dispatchDisplayHint(int hint) {
		// TODO Auto-generated method stub
		super.dispatchDisplayHint(hint);
	}

	@Override
	protected void onDisplayHint(int hint) {
		// TODO Auto-generated method stub
		super.onDisplayHint(hint);
	}

	@Override
	public void dispatchWindowVisibilityChanged(int visibility) {
		// TODO Auto-generated method stub
		super.dispatchWindowVisibilityChanged(visibility);
	}

	@Override
	protected void onWindowVisibilityChanged(int visibility) {
		// TODO Auto-generated method stub
		super.onWindowVisibilityChanged(visibility);
	}

	@Override
	public int getWindowVisibility() {
		// TODO Auto-generated method stub
		return super.getWindowVisibility();
	}

	@Override
	public void getWindowVisibleDisplayFrame(Rect outRect) {
		// TODO Auto-generated method stub
		super.getWindowVisibleDisplayFrame(outRect);
	}

	@Override
	public void dispatchConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.dispatchConfigurationChanged(newConfig);
	}

	@Override
	protected void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}

	@Override
	@ExportedProperty
	public boolean isInTouchMode() {
		// TODO Auto-generated method stub
		return super.isInTouchMode();
	}

	@Override
	public boolean onKeyPreIme(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyPreIme(keyCode, event);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onKeyLongPress(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyLongPress(keyCode, event);
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyUp(keyCode, event);
	}

	@Override
	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyMultiple(keyCode, repeatCount, event);
	}

	@Override
	public boolean onKeyShortcut(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		return super.onKeyShortcut(keyCode, event);
	}

	@Override
	public boolean onCheckIsTextEditor() {
		// TODO Auto-generated method stub
		return super.onCheckIsTextEditor();
	}

	@Override
	public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
		// TODO Auto-generated method stub
		return super.onCreateInputConnection(outAttrs);
	}

	@Override
	public boolean checkInputConnectionProxy(View view) {
		// TODO Auto-generated method stub
		return super.checkInputConnectionProxy(view);
	}

	@Override
	public void createContextMenu(ContextMenu menu) {
		// TODO Auto-generated method stub
		super.createContextMenu(menu);
	}

	@Override
	protected ContextMenuInfo getContextMenuInfo() {
		// TODO Auto-generated method stub
		return super.getContextMenuInfo();
	}

	@Override
	protected void onCreateContextMenu(ContextMenu menu) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu);
	}

	@Override
	public boolean onTrackballEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onTrackballEvent(event);
	}

	@Override
	public boolean onGenericMotionEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onGenericMotionEvent(event);
	}

	@Override
	public boolean onHoverEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onHoverEvent(event);
	}

	@Override
	@ExportedProperty
	public boolean isHovered() {
		// TODO Auto-generated method stub
		return super.isHovered();
	}

	@Override
	public void setHovered(boolean hovered) {
		// TODO Auto-generated method stub
		super.setHovered(hovered);
	}

	@Override
	public void onHoverChanged(boolean hovered) {
		// TODO Auto-generated method stub
		super.onHoverChanged(hovered);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onTouchEvent(event);
	}

	@Override
	public void cancelLongPress() {
		// TODO Auto-generated method stub
		super.cancelLongPress();
	}

	@Override
	public void setTouchDelegate(TouchDelegate delegate) {
		// TODO Auto-generated method stub
		super.setTouchDelegate(delegate);
	}

	@Override
	public TouchDelegate getTouchDelegate() {
		// TODO Auto-generated method stub
		return super.getTouchDelegate();
	}

	@Override
	public void bringToFront() {
		// TODO Auto-generated method stub
		super.bringToFront();
	}

	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		// TODO Auto-generated method stub
		super.onScrollChanged(l, t, oldl, oldt);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO Auto-generated method stub
		super.onSizeChanged(w, h, oldw, oldh);
	}

	@Override
	protected void dispatchDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.dispatchDraw(canvas);
	}

	@Override
	public void setScrollX(int value) {
		// TODO Auto-generated method stub
		super.setScrollX(value);
	}

	@Override
	public void setScrollY(int value) {
		// TODO Auto-generated method stub
		super.setScrollY(value);
	}

	@Override
	public void getDrawingRect(Rect outRect) {
		// TODO Auto-generated method stub
		super.getDrawingRect(outRect);
	}

	@Override
	public Matrix getMatrix() {
		// TODO Auto-generated method stub
		return super.getMatrix();
	}

	@Override
	public float getCameraDistance() {
		// TODO Auto-generated method stub
		return super.getCameraDistance();
	}

	@Override
	public void setCameraDistance(float distance) {
		// TODO Auto-generated method stub
		super.setCameraDistance(distance);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getRotation() {
		// TODO Auto-generated method stub
		return super.getRotation();
	}

	@Override
	public void setRotation(float rotation) {
		// TODO Auto-generated method stub
		super.setRotation(rotation);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getRotationY() {
		// TODO Auto-generated method stub
		return super.getRotationY();
	}

	@Override
	public void setRotationY(float rotationY) {
		// TODO Auto-generated method stub
		super.setRotationY(rotationY);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getRotationX() {
		// TODO Auto-generated method stub
		return super.getRotationX();
	}

	@Override
	public void setRotationX(float rotationX) {
		// TODO Auto-generated method stub
		super.setRotationX(rotationX);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getScaleX() {
		// TODO Auto-generated method stub
		return super.getScaleX();
	}

	@Override
	public void setScaleX(float scaleX) {
		// TODO Auto-generated method stub
		super.setScaleX(scaleX);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getScaleY() {
		// TODO Auto-generated method stub
		return super.getScaleY();
	}

	@Override
	public void setScaleY(float scaleY) {
		// TODO Auto-generated method stub
		super.setScaleY(scaleY);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getPivotX() {
		// TODO Auto-generated method stub
		return super.getPivotX();
	}

	@Override
	public void setPivotX(float pivotX) {
		// TODO Auto-generated method stub
		super.setPivotX(pivotX);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getPivotY() {
		// TODO Auto-generated method stub
		return super.getPivotY();
	}

	@Override
	public void setPivotY(float pivotY) {
		// TODO Auto-generated method stub
		super.setPivotY(pivotY);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getAlpha() {
		// TODO Auto-generated method stub
		return super.getAlpha();
	}

	@Override
	public boolean hasOverlappingRendering() {
		// TODO Auto-generated method stub
		return super.hasOverlappingRendering();
	}

	@Override
	public void setAlpha(float alpha) {
		// TODO Auto-generated method stub
		super.setAlpha(alpha);
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return super.isDirty();
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}

	@Override
	public void setX(float x) {
		// TODO Auto-generated method stub
		super.setX(x);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}

	@Override
	public void setY(float y) {
		// TODO Auto-generated method stub
		super.setY(y);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getTranslationX() {
		// TODO Auto-generated method stub
		return super.getTranslationX();
	}

	@Override
	public void setTranslationX(float translationX) {
		// TODO Auto-generated method stub
		super.setTranslationX(translationX);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public float getTranslationY() {
		// TODO Auto-generated method stub
		return super.getTranslationY();
	}

	@Override
	public void setTranslationY(float translationY) {
		// TODO Auto-generated method stub
		super.setTranslationY(translationY);
	}

	@Override
	public void getHitRect(Rect outRect) {
		// TODO Auto-generated method stub
		super.getHitRect(outRect);
	}

	@Override
	public void getFocusedRect(Rect r) {
		// TODO Auto-generated method stub
		super.getFocusedRect(r);
	}

	@Override
	public boolean getGlobalVisibleRect(Rect r, Point globalOffset) {
		// TODO Auto-generated method stub
		return super.getGlobalVisibleRect(r, globalOffset);
	}

	@Override
	public void offsetTopAndBottom(int offset) {
		// TODO Auto-generated method stub
		super.offsetTopAndBottom(offset);
	}

	@Override
	public void offsetLeftAndRight(int offset) {
		// TODO Auto-generated method stub
		super.offsetLeftAndRight(offset);
	}

	@Override
	@ExportedProperty(deepExport = true, prefix = "layout_")
	public LayoutParams getLayoutParams() {
		// TODO Auto-generated method stub
		return super.getLayoutParams();
	}

	@Override
	public void setLayoutParams(LayoutParams params) {
		// TODO Auto-generated method stub
		super.setLayoutParams(params);
	}

	@Override
	public void scrollTo(int x, int y) {
		// TODO Auto-generated method stub
		super.scrollTo(x, y);
	}

	@Override
	public void scrollBy(int x, int y) {
		// TODO Auto-generated method stub
		super.scrollBy(x, y);
	}

	@Override
	protected boolean awakenScrollBars() {
		// TODO Auto-generated method stub
		return super.awakenScrollBars();
	}

	@Override
	protected boolean awakenScrollBars(int startDelay) {
		// TODO Auto-generated method stub
		return super.awakenScrollBars(startDelay);
	}

	@Override
	protected boolean awakenScrollBars(int startDelay, boolean invalidate) {
		// TODO Auto-generated method stub
		return super.awakenScrollBars(startDelay, invalidate);
	}

	@Override
	public void invalidate(Rect dirty) {
		// TODO Auto-generated method stub
		super.invalidate(dirty);
	}

	@Override
	public void invalidate(int l, int t, int r, int b) {
		// TODO Auto-generated method stub
		super.invalidate(l, t, r, b);
	}

	@Override
	public void invalidate() {
		// TODO Auto-generated method stub
		super.invalidate();
	}

	@Override
	@ExportedProperty(category = "drawing")
	public boolean isOpaque() {
		// TODO Auto-generated method stub
		return super.isOpaque();
	}

	@Override
	public Handler getHandler() {
		// TODO Auto-generated method stub
		return super.getHandler();
	}

	@Override
	public boolean post(Runnable action) {
		// TODO Auto-generated method stub
		return super.post(action);
	}

	@Override
	public boolean postDelayed(Runnable action, long delayMillis) {
		// TODO Auto-generated method stub
		return super.postDelayed(action, delayMillis);
	}

	@Override
	public void postOnAnimation(Runnable action) {
		// TODO Auto-generated method stub
		super.postOnAnimation(action);
	}

	@Override
	public void postOnAnimationDelayed(Runnable action, long delayMillis) {
		// TODO Auto-generated method stub
		super.postOnAnimationDelayed(action, delayMillis);
	}

	@Override
	public boolean removeCallbacks(Runnable action) {
		// TODO Auto-generated method stub
		return super.removeCallbacks(action);
	}

	@Override
	public void postInvalidate() {
		// TODO Auto-generated method stub
		super.postInvalidate();
	}

	@Override
	public void postInvalidate(int left, int top, int right, int bottom) {
		// TODO Auto-generated method stub
		super.postInvalidate(left, top, right, bottom);
	}

	@Override
	public void postInvalidateDelayed(long delayMilliseconds) {
		// TODO Auto-generated method stub
		super.postInvalidateDelayed(delayMilliseconds);
	}

	@Override
	public void postInvalidateDelayed(long delayMilliseconds, int left,
			int top, int right, int bottom) {
		// TODO Auto-generated method stub
		super.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom);
	}

	@Override
	public void postInvalidateOnAnimation() {
		// TODO Auto-generated method stub
		super.postInvalidateOnAnimation();
	}

	@Override
	public void postInvalidateOnAnimation(int left, int top, int right,
			int bottom) {
		// TODO Auto-generated method stub
		super.postInvalidateOnAnimation(left, top, right, bottom);
	}

	@Override
	public void computeScroll() {
		// TODO Auto-generated method stub
		super.computeScroll();
	}

	@Override
	public boolean isHorizontalFadingEdgeEnabled() {
		// TODO Auto-generated method stub
		return super.isHorizontalFadingEdgeEnabled();
	}

	@Override
	public void setHorizontalFadingEdgeEnabled(
			boolean horizontalFadingEdgeEnabled) {
		// TODO Auto-generated method stub
		super.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
	}

	@Override
	public boolean isVerticalFadingEdgeEnabled() {
		// TODO Auto-generated method stub
		return super.isVerticalFadingEdgeEnabled();
	}

	@Override
	public void setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
		// TODO Auto-generated method stub
		super.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
	}

	@Override
	protected float getTopFadingEdgeStrength() {
		// TODO Auto-generated method stub
		return super.getTopFadingEdgeStrength();
	}

	@Override
	protected float getBottomFadingEdgeStrength() {
		// TODO Auto-generated method stub
		return super.getBottomFadingEdgeStrength();
	}

	@Override
	protected float getLeftFadingEdgeStrength() {
		// TODO Auto-generated method stub
		return super.getLeftFadingEdgeStrength();
	}

	@Override
	protected float getRightFadingEdgeStrength() {
		// TODO Auto-generated method stub
		return super.getRightFadingEdgeStrength();
	}

	@Override
	public boolean isHorizontalScrollBarEnabled() {
		// TODO Auto-generated method stub
		return super.isHorizontalScrollBarEnabled();
	}

	@Override
	public void setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
		// TODO Auto-generated method stub
		super.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
	}

	@Override
	public boolean isVerticalScrollBarEnabled() {
		// TODO Auto-generated method stub
		return super.isVerticalScrollBarEnabled();
	}

	@Override
	public void setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
		// TODO Auto-generated method stub
		super.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
	}

	@Override
	public void setScrollbarFadingEnabled(boolean fadeScrollbars) {
		// TODO Auto-generated method stub
		super.setScrollbarFadingEnabled(fadeScrollbars);
	}

	@Override
	public boolean isScrollbarFadingEnabled() {
		// TODO Auto-generated method stub
		return super.isScrollbarFadingEnabled();
	}

	@Override
	public int getScrollBarDefaultDelayBeforeFade() {
		// TODO Auto-generated method stub
		return super.getScrollBarDefaultDelayBeforeFade();
	}

	@Override
	public void setScrollBarDefaultDelayBeforeFade(
			int scrollBarDefaultDelayBeforeFade) {
		// TODO Auto-generated method stub
		super.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade);
	}

	@Override
	public int getScrollBarFadeDuration() {
		// TODO Auto-generated method stub
		return super.getScrollBarFadeDuration();
	}

	@Override
	public void setScrollBarFadeDuration(int scrollBarFadeDuration) {
		// TODO Auto-generated method stub
		super.setScrollBarFadeDuration(scrollBarFadeDuration);
	}

	@Override
	public int getScrollBarSize() {
		// TODO Auto-generated method stub
		return super.getScrollBarSize();
	}

	@Override
	public void setScrollBarSize(int scrollBarSize) {
		// TODO Auto-generated method stub
		super.setScrollBarSize(scrollBarSize);
	}

	@Override
	public void setScrollBarStyle(int style) {
		// TODO Auto-generated method stub
		super.setScrollBarStyle(style);
	}

	@Override
	@ExportedProperty(mapping = {
			@IntToString(from = 0, to = "INSIDE_OVERLAY"),
			@IntToString(from = 16777216, to = "INSIDE_INSET"),
			@IntToString(from = 33554432, to = "OUTSIDE_OVERLAY"),
			@IntToString(from = 50331648, to = "OUTSIDE_INSET") })
	public int getScrollBarStyle() {
		// TODO Auto-generated method stub
		return super.getScrollBarStyle();
	}

	@Override
	protected int computeHorizontalScrollRange() {
		// TODO Auto-generated method stub
		return super.computeHorizontalScrollRange();
	}

	@Override
	protected int computeHorizontalScrollOffset() {
		// TODO Auto-generated method stub
		return super.computeHorizontalScrollOffset();
	}

	@Override
	protected int computeHorizontalScrollExtent() {
		// TODO Auto-generated method stub
		return super.computeHorizontalScrollExtent();
	}

	@Override
	protected int computeVerticalScrollRange() {
		// TODO Auto-generated method stub
		return super.computeVerticalScrollRange();
	}

	@Override
	protected int computeVerticalScrollOffset() {
		// TODO Auto-generated method stub
		return super.computeVerticalScrollOffset();
	}

	@Override
	protected int computeVerticalScrollExtent() {
		// TODO Auto-generated method stub
		return super.computeVerticalScrollExtent();
	}

	@Override
	public boolean canScrollHorizontally(int direction) {
		// TODO Auto-generated method stub
		return super.canScrollHorizontally(direction);
	}

	@Override
	public boolean canScrollVertically(int direction) {
		// TODO Auto-generated method stub
		return super.canScrollVertically(direction);
	}

	@Override
	protected void onAttachedToWindow() {
		// TODO Auto-generated method stub
		super.onAttachedToWindow();
	}

	@Override
	public void onScreenStateChanged(int screenState) {
		// TODO Auto-generated method stub
		super.onScreenStateChanged(screenState);
	}

	@Override
	public void onRtlPropertiesChanged(int layoutDirection) {
		// TODO Auto-generated method stub
		super.onRtlPropertiesChanged(layoutDirection);
	}

	@Override
	public boolean canResolveLayoutDirection() {
		// TODO Auto-generated method stub
		return super.canResolveLayoutDirection();
	}

	@Override
	public boolean isLayoutDirectionResolved() {
		// TODO Auto-generated method stub
		return super.isLayoutDirectionResolved();
	}

	@Override
	protected void onDetachedFromWindow() {
		// TODO Auto-generated method stub
		super.onDetachedFromWindow();
	}

	@Override
	protected int getWindowAttachCount() {
		// TODO Auto-generated method stub
		return super.getWindowAttachCount();
	}

	@Override
	public IBinder getWindowToken() {
		// TODO Auto-generated method stub
		return super.getWindowToken();
	}

	@Override
	public WindowId getWindowId() {
		// TODO Auto-generated method stub
		return super.getWindowId();
	}

	@Override
	public IBinder getApplicationWindowToken() {
		// TODO Auto-generated method stub
		return super.getApplicationWindowToken();
	}

	@Override
	public Display getDisplay() {
		// TODO Auto-generated method stub
		return super.getDisplay();
	}

	@Override
	public void onCancelPendingInputEvents() {
		// TODO Auto-generated method stub
		super.onCancelPendingInputEvents();
	}

	@Override
	public void saveHierarchyState(SparseArray<Parcelable> container) {
		// TODO Auto-generated method stub
		super.saveHierarchyState(container);
	}

	@Override
	protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
		// TODO Auto-generated method stub
		super.dispatchSaveInstanceState(container);
	}

	@Override
	protected Parcelable onSaveInstanceState() {
		// TODO Auto-generated method stub
		return super.onSaveInstanceState();
	}

	@Override
	public void restoreHierarchyState(SparseArray<Parcelable> container) {
		// TODO Auto-generated method stub
		super.restoreHierarchyState(container);
	}

	@Override
	protected void dispatchRestoreInstanceState(
			SparseArray<Parcelable> container) {
		// TODO Auto-generated method stub
		super.dispatchRestoreInstanceState(container);
	}

	@Override
	protected void onRestoreInstanceState(Parcelable state) {
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(state);
	}

	@Override
	public long getDrawingTime() {
		// TODO Auto-generated method stub
		return super.getDrawingTime();
	}

	@Override
	public void setDuplicateParentStateEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setDuplicateParentStateEnabled(enabled);
	}

	@Override
	public boolean isDuplicateParentStateEnabled() {
		// TODO Auto-generated method stub
		return super.isDuplicateParentStateEnabled();
	}

	@Override
	public void setLayerType(int layerType, Paint paint) {
		// TODO Auto-generated method stub
		super.setLayerType(layerType, paint);
	}

	@Override
	public void setLayerPaint(Paint paint) {
		// TODO Auto-generated method stub
		super.setLayerPaint(paint);
	}

	@Override
	public int getLayerType() {
		// TODO Auto-generated method stub
		return super.getLayerType();
	}

	@Override
	public void buildLayer() {
		// TODO Auto-generated method stub
		super.buildLayer();
	}

	@Override
	public void setDrawingCacheEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		super.setDrawingCacheEnabled(enabled);
	}

	@Override
	@ExportedProperty(category = "drawing")
	public boolean isDrawingCacheEnabled() {
		// TODO Auto-generated method stub
		return super.isDrawingCacheEnabled();
	}

	@Override
	public Bitmap getDrawingCache() {
		// TODO Auto-generated method stub
		return super.getDrawingCache();
	}

	@Override
	public Bitmap getDrawingCache(boolean autoScale) {
		// TODO Auto-generated method stub
		return super.getDrawingCache(autoScale);
	}

	@Override
	public void destroyDrawingCache() {
		// TODO Auto-generated method stub
		super.destroyDrawingCache();
	}

	@Override
	public void setDrawingCacheBackgroundColor(int color) {
		// TODO Auto-generated method stub
		super.setDrawingCacheBackgroundColor(color);
	}

	@Override
	public int getDrawingCacheBackgroundColor() {
		// TODO Auto-generated method stub
		return super.getDrawingCacheBackgroundColor();
	}

	@Override
	public void buildDrawingCache() {
		// TODO Auto-generated method stub
		super.buildDrawingCache();
	}

	@Override
	public void buildDrawingCache(boolean autoScale) {
		// TODO Auto-generated method stub
		super.buildDrawingCache(autoScale);
	}

	@Override
	public boolean isInEditMode() {
		// TODO Auto-generated method stub
		return super.isInEditMode();
	}

	@Override
	protected boolean isPaddingOffsetRequired() {
		// TODO Auto-generated method stub
		return super.isPaddingOffsetRequired();
	}

	@Override
	protected int getLeftPaddingOffset() {
		// TODO Auto-generated method stub
		return super.getLeftPaddingOffset();
	}

	@Override
	protected int getRightPaddingOffset() {
		// TODO Auto-generated method stub
		return super.getRightPaddingOffset();
	}

	@Override
	protected int getTopPaddingOffset() {
		// TODO Auto-generated method stub
		return super.getTopPaddingOffset();
	}

	@Override
	protected int getBottomPaddingOffset() {
		// TODO Auto-generated method stub
		return super.getBottomPaddingOffset();
	}

	@Override
	public boolean isHardwareAccelerated() {
		// TODO Auto-generated method stub
		return super.isHardwareAccelerated();
	}

	@Override
	public void setClipBounds(Rect clipBounds) {
		// TODO Auto-generated method stub
		super.setClipBounds(clipBounds);
	}

	@Override
	public Rect getClipBounds() {
		// TODO Auto-generated method stub
		return super.getClipBounds();
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.draw(canvas);
	}

	@Override
	public ViewOverlay getOverlay() {
		// TODO Auto-generated method stub
		return super.getOverlay();
	}

	@Override
	@ExportedProperty(category = "drawing")
	public int getSolidColor() {
		// TODO Auto-generated method stub
		return super.getSolidColor();
	}

	@Override
	public boolean isLayoutRequested() {
		// TODO Auto-generated method stub
		return super.isLayoutRequested();
	}

	@Override
	public void layout(int l, int t, int r, int b) {
		// TODO Auto-generated method stub
		super.layout(l, t, r, b);
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		// TODO Auto-generated method stub
		super.onLayout(changed, left, top, right, bottom);
	}

	@Override
	protected void onFinishInflate() {
		// TODO Auto-generated method stub
		super.onFinishInflate();
	}

	@Override
	public Resources getResources() {
		// TODO Auto-generated method stub
		return super.getResources();
	}

	@Override
	public void invalidateDrawable(Drawable drawable) {
		// TODO Auto-generated method stub
		super.invalidateDrawable(drawable);
	}

	@Override
	public void scheduleDrawable(Drawable who, Runnable what, long when) {
		// TODO Auto-generated method stub
		super.scheduleDrawable(who, what, when);
	}

	@Override
	public void unscheduleDrawable(Drawable who, Runnable what) {
		// TODO Auto-generated method stub
		super.unscheduleDrawable(who, what);
	}

	@Override
	public void unscheduleDrawable(Drawable who) {
		// TODO Auto-generated method stub
		super.unscheduleDrawable(who);
	}

	@Override
	protected boolean verifyDrawable(Drawable who) {
		// TODO Auto-generated method stub
		return super.verifyDrawable(who);
	}

	@Override
	protected void drawableStateChanged() {
		// TODO Auto-generated method stub
		super.drawableStateChanged();
	}

	@Override
	public void refreshDrawableState() {
		// TODO Auto-generated method stub
		super.refreshDrawableState();
	}

	@Override
	protected int[] onCreateDrawableState(int extraSpace) {
		// TODO Auto-generated method stub
		return super.onCreateDrawableState(extraSpace);
	}

	@Override
	public void jumpDrawablesToCurrentState() {
		// TODO Auto-generated method stub
		super.jumpDrawablesToCurrentState();
	}

	@Override
	public void setBackgroundColor(int color) {
		// TODO Auto-generated method stub
		super.setBackgroundColor(color);
	}

	@Override
	public void setBackgroundResource(int resid) {
		// TODO Auto-generated method stub
		super.setBackgroundResource(resid);
	}

	@Override
	public void setBackground(Drawable background) {
		// TODO Auto-generated method stub
		super.setBackground(background);
	}

	@Override
	@Deprecated
	public void setBackgroundDrawable(Drawable background) {
		// TODO Auto-generated method stub
		super.setBackgroundDrawable(background);
	}

	@Override
	public Drawable getBackground() {
		// TODO Auto-generated method stub
		return super.getBackground();
	}

	@Override
	public void setPadding(int left, int top, int right, int bottom) {
		// TODO Auto-generated method stub
		super.setPadding(left, top, right, bottom);
	}

	@Override
	public void setPaddingRelative(int start, int top, int end, int bottom) {
		// TODO Auto-generated method stub
		super.setPaddingRelative(start, top, end, bottom);
	}

	@Override
	public int getPaddingTop() {
		// TODO Auto-generated method stub
		return super.getPaddingTop();
	}

	@Override
	public int getPaddingBottom() {
		// TODO Auto-generated method stub
		return super.getPaddingBottom();
	}

	@Override
	public int getPaddingLeft() {
		// TODO Auto-generated method stub
		return super.getPaddingLeft();
	}

	@Override
	public int getPaddingStart() {
		// TODO Auto-generated method stub
		return super.getPaddingStart();
	}

	@Override
	public int getPaddingRight() {
		// TODO Auto-generated method stub
		return super.getPaddingRight();
	}

	@Override
	public int getPaddingEnd() {
		// TODO Auto-generated method stub
		return super.getPaddingEnd();
	}

	@Override
	public boolean isPaddingRelative() {
		// TODO Auto-generated method stub
		return super.isPaddingRelative();
	}

	@Override
	public void setSelected(boolean selected) {
		// TODO Auto-generated method stub
		super.setSelected(selected);
	}

	@Override
	protected void dispatchSetSelected(boolean selected) {
		// TODO Auto-generated method stub
		super.dispatchSetSelected(selected);
	}

	@Override
	@ExportedProperty
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return super.isSelected();
	}

	@Override
	public void setActivated(boolean activated) {
		// TODO Auto-generated method stub
		super.setActivated(activated);
	}

	@Override
	protected void dispatchSetActivated(boolean activated) {
		// TODO Auto-generated method stub
		super.dispatchSetActivated(activated);
	}

	@Override
	@ExportedProperty
	public boolean isActivated() {
		// TODO Auto-generated method stub
		return super.isActivated();
	}

	@Override
	public ViewTreeObserver getViewTreeObserver() {
		// TODO Auto-generated method stub
		return super.getViewTreeObserver();
	}

	@Override
	public View getRootView() {
		// TODO Auto-generated method stub
		return super.getRootView();
	}

	@Override
	public void getLocationOnScreen(int[] location) {
		// TODO Auto-generated method stub
		super.getLocationOnScreen(location);
	}

	@Override
	public void getLocationInWindow(int[] location) {
		// TODO Auto-generated method stub
		super.getLocationInWindow(location);
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	@CapturedViewProperty
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	@ExportedProperty
	public Object getTag() {
		// TODO Auto-generated method stub
		return super.getTag();
	}

	@Override
	public void setTag(Object tag) {
		// TODO Auto-generated method stub
		super.setTag(tag);
	}

	@Override
	public Object getTag(int key) {
		// TODO Auto-generated method stub
		return super.getTag(key);
	}

	@Override
	public void setTag(int key, Object tag) {
		// TODO Auto-generated method stub
		super.setTag(key, tag);
	}

	@Override
	@ExportedProperty(category = "layout")
	public int getBaseline() {
		// TODO Auto-generated method stub
		return super.getBaseline();
	}

	@Override
	public boolean isInLayout() {
		// TODO Auto-generated method stub
		return super.isInLayout();
	}

	@Override
	public void requestLayout() {
		// TODO Auto-generated method stub
		super.requestLayout();
	}

	@Override
	public void forceLayout() {
		// TODO Auto-generated method stub
		super.forceLayout();
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected int getSuggestedMinimumHeight() {
		// TODO Auto-generated method stub
		return super.getSuggestedMinimumHeight();
	}

	@Override
	protected int getSuggestedMinimumWidth() {
		// TODO Auto-generated method stub
		return super.getSuggestedMinimumWidth();
	}

	@Override
	public int getMinimumHeight() {
		// TODO Auto-generated method stub
		return super.getMinimumHeight();
	}

	@Override
	public void setMinimumHeight(int minHeight) {
		// TODO Auto-generated method stub
		super.setMinimumHeight(minHeight);
	}

	@Override
	public int getMinimumWidth() {
		// TODO Auto-generated method stub
		return super.getMinimumWidth();
	}

	@Override
	public void setMinimumWidth(int minWidth) {
		// TODO Auto-generated method stub
		super.setMinimumWidth(minWidth);
	}

	@Override
	public Animation getAnimation() {
		// TODO Auto-generated method stub
		return super.getAnimation();
	}

	@Override
	public void startAnimation(Animation animation) {
		// TODO Auto-generated method stub
		super.startAnimation(animation);
	}

	@Override
	public void clearAnimation() {
		// TODO Auto-generated method stub
		super.clearAnimation();
	}

	@Override
	public void setAnimation(Animation animation) {
		// TODO Auto-generated method stub
		super.setAnimation(animation);
	}

	@Override
	protected void onAnimationStart() {
		// TODO Auto-generated method stub
		super.onAnimationStart();
	}

	@Override
	protected void onAnimationEnd() {
		// TODO Auto-generated method stub
		super.onAnimationEnd();
	}

	@Override
	protected boolean onSetAlpha(int alpha) {
		// TODO Auto-generated method stub
		return super.onSetAlpha(alpha);
	}

	@Override
	public void playSoundEffect(int soundConstant) {
		// TODO Auto-generated method stub
		super.playSoundEffect(soundConstant);
	}

	@Override
	public boolean performHapticFeedback(int feedbackConstant) {
		// TODO Auto-generated method stub
		return super.performHapticFeedback(feedbackConstant);
	}

	@Override
	public boolean performHapticFeedback(int feedbackConstant, int flags) {
		// TODO Auto-generated method stub
		return super.performHapticFeedback(feedbackConstant, flags);
	}

	@Override
	public void setSystemUiVisibility(int visibility) {
		// TODO Auto-generated method stub
		super.setSystemUiVisibility(visibility);
	}

	@Override
	public int getSystemUiVisibility() {
		// TODO Auto-generated method stub
		return super.getSystemUiVisibility();
	}

	@Override
	public int getWindowSystemUiVisibility() {
		// TODO Auto-generated method stub
		return super.getWindowSystemUiVisibility();
	}

	@Override
	public void onWindowSystemUiVisibilityChanged(int visible) {
		// TODO Auto-generated method stub
		super.onWindowSystemUiVisibilityChanged(visible);
	}

	@Override
	public void dispatchWindowSystemUiVisiblityChanged(int visible) {
		// TODO Auto-generated method stub
		super.dispatchWindowSystemUiVisiblityChanged(visible);
	}

	@Override
	public void setOnSystemUiVisibilityChangeListener(
			OnSystemUiVisibilityChangeListener l) {
		// TODO Auto-generated method stub
		super.setOnSystemUiVisibilityChangeListener(l);
	}

	@Override
	public void dispatchSystemUiVisibilityChanged(int visibility) {
		// TODO Auto-generated method stub
		super.dispatchSystemUiVisibilityChanged(visibility);
	}

	@Override
	public boolean onDragEvent(DragEvent event) {
		// TODO Auto-generated method stub
		return super.onDragEvent(event);
	}

	@Override
	public boolean dispatchDragEvent(DragEvent event) {
		// TODO Auto-generated method stub
		return super.dispatchDragEvent(event);
	}

	@Override
	protected boolean overScrollBy(int deltaX, int deltaY, int scrollX,
			int scrollY, int scrollRangeX, int scrollRangeY,
			int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
		// TODO Auto-generated method stub
		return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX,
				scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
	}

	@Override
	protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX,
			boolean clampedY) {
		// TODO Auto-generated method stub
		super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
	}

	@Override
	public int getOverScrollMode() {
		// TODO Auto-generated method stub
		return super.getOverScrollMode();
	}

	@Override
	public void setOverScrollMode(int overScrollMode) {
		// TODO Auto-generated method stub
		super.setOverScrollMode(overScrollMode);
	}

	@Override
	public void setTextDirection(int textDirection) {
		// TODO Auto-generated method stub
		super.setTextDirection(textDirection);
	}

	@Override
	@ExportedProperty(category = "text", mapping = {
			@IntToString(from = 0, to = "INHERIT"),
			@IntToString(from = 1, to = "FIRST_STRONG"),
			@IntToString(from = 2, to = "ANY_RTL"),
			@IntToString(from = 3, to = "LTR"),
			@IntToString(from = 4, to = "RTL"),
			@IntToString(from = 5, to = "LOCALE") })
	public int getTextDirection() {
		// TODO Auto-generated method stub
		return super.getTextDirection();
	}

	@Override
	public boolean canResolveTextDirection() {
		// TODO Auto-generated method stub
		return super.canResolveTextDirection();
	}

	@Override
	public boolean isTextDirectionResolved() {
		// TODO Auto-generated method stub
		return super.isTextDirectionResolved();
	}

	@Override
	public void setTextAlignment(int textAlignment) {
		// TODO Auto-generated method stub
		super.setTextAlignment(textAlignment);
	}

	@Override
	@ExportedProperty(category = "text", mapping = {
			@IntToString(from = 0, to = "INHERIT"),
			@IntToString(from = 1, to = "GRAVITY"),
			@IntToString(from = 2, to = "TEXT_START"),
			@IntToString(from = 3, to = "TEXT_END"),
			@IntToString(from = 4, to = "CENTER"),
			@IntToString(from = 5, to = "VIEW_START"),
			@IntToString(from = 6, to = "VIEW_END") })
	public int getTextAlignment() {
		// TODO Auto-generated method stub
		return super.getTextAlignment();
	}

	@Override
	public boolean canResolveTextAlignment() {
		// TODO Auto-generated method stub
		return super.canResolveTextAlignment();
	}

	@Override
	public boolean isTextAlignmentResolved() {
		// TODO Auto-generated method stub
		return super.isTextAlignmentResolved();
	}

	@Override
	public ViewPropertyAnimator animate() {
		// TODO Auto-generated method stub
		return super.animate();
	}
    
    
    
    
    
}
