package com.google.research.xeno.effect;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.research.xeno.effect.UserInteractionManager;
import defpackage.exkm;
import defpackage.exkn;
import defpackage.exko;
import defpackage.exlo;
import defpackage.exlp;
import defpackage.exmb;
import defpackage.exmq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UserInteractionManager implements exlo {
    public static final String a = "UserInteractionManager";
    public long b;
    public exkm c;

    public UserInteractionManager() {
        new exlp(this);
        new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    public static native void nativeSendGestureEvent(long j, byte[] bArr);

    public static native void nativeSendTouchEvent(long j, byte[] bArr);

    @Override // defpackage.exlo
    public final void a(final exmb exmbVar) {
        exko.a(this.c, new exkn() { // from class: exlr
            @Override // defpackage.exkn
            public final void a(long j) {
                if (j == 0) {
                    Log.w(UserInteractionManager.a, "Sending gesture event to user interaction manager which is released");
                } else {
                    UserInteractionManager.nativeSendGestureEvent(this.a.b, exmbVar.toByteArray());
                }
            }
        });
    }

    @Override // defpackage.exlo
    public final void b(final exmq exmqVar) {
        exko.a(this.c, new exkn() { // from class: exlq
            @Override // defpackage.exkn
            public final void a(long j) {
                if (j == 0) {
                    Log.w(UserInteractionManager.a, "Sending touch event to user interaction manager which is released");
                } else {
                    UserInteractionManager.nativeSendTouchEvent(this.a.b, exmqVar.toByteArray());
                }
            }
        });
    }
}
