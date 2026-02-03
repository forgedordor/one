package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itf {
    public static final irs a = new irs(fcvo.a);

    public static final ics a(ics icsVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return icsVar.a(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }

    public static final ics b(ics icsVar, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return icsVar.a(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3));
    }

    public static final ics c(ics icsVar, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return icsVar.a(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4));
    }
}
