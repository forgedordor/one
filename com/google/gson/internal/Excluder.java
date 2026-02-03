package com.google.gson.internal;

import defpackage.esxv;
import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.eszv;
import defpackage.etcv;
import defpackage.etcz;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Excluder implements Cloneable, esyw {
    public static final Excluder a = new Excluder();
    public boolean d;
    public final double b = -1.0d;
    public final int c = 136;
    public final List e = Collections.EMPTY_LIST;
    public final List f = Collections.EMPTY_LIST;

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        Class cls = etczVar.a;
        boolean zC = c(cls, true);
        boolean zC2 = c(cls, false);
        if (zC || zC2) {
            return new eszv(this, zC2, zC, esydVar, etczVar);
        }
        return null;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean c(Class cls, boolean z) {
        List list;
        if (z) {
            list = this.e;
        } else {
            if (!Enum.class.isAssignableFrom(cls) && etcv.h(cls)) {
                return true;
            }
            list = this.f;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((esxv) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
