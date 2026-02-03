package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etcz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TypeAdapters$29 implements esyw {
    final /* synthetic */ Class a;
    final /* synthetic */ esyv b;

    public TypeAdapters$29(Class cls, esyv esyvVar) {
        this.a = cls;
        this.b = esyvVar;
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        if (etczVar.a == this.a) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        esyv esyvVar = this.b;
        return "Factory[type=" + this.a.getName() + ",adapter=" + esyvVar.toString() + "]";
    }
}
