package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvle {
    public static final ejxr a = cdag.w(133388132, "enable_scheduled_send_long_click_description");
    public final Context b;
    public final Resources c;
    public final Optional d;
    public final bwdo e;
    private View.AccessibilityDelegate f;
    private View.AccessibilityDelegate g;
    private View.AccessibilityDelegate h;

    public cvle(Context context, bwdo bwdoVar, Optional optional) {
        this.b = context;
        this.c = context.getResources();
        this.e = bwdoVar;
        this.d = optional;
    }

    public final synchronized View.AccessibilityDelegate a() {
        if (this.f == null) {
            this.f = new cvlb();
        }
        return this.f;
    }

    public final synchronized View.AccessibilityDelegate b() {
        if (this.h == null) {
            if (this.d.isEmpty()) {
                throw new IllegalStateException("ScheduledSendResources not provided. Is a module missing?");
            }
            this.h = new cvld(this);
        }
        return this.h;
    }

    public final synchronized View.AccessibilityDelegate c() {
        if (this.g == null) {
            this.g = new cvlc(this);
        }
        return this.g;
    }

    public final String d(int i) {
        return this.c.getString(i);
    }

    public final String e(int i, String str) {
        return this.c.getString(i, str);
    }
}
