package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etcz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TypeAdapters$30 implements esyw {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ esyv c;

    public TypeAdapters$30(Class cls, Class cls2, esyv esyvVar) {
        this.a = cls;
        this.b = cls2;
        this.c = esyvVar;
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        Class cls = etczVar.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        esyv esyvVar = this.c;
        Class cls = this.a;
        return "Factory[type=" + this.b.getName() + "+" + cls.getName() + ",adapter=" + esyvVar.toString() + "]";
    }
}
