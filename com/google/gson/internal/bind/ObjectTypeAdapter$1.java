package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.etbf;
import defpackage.etcz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ObjectTypeAdapter$1 implements esyw {
    final /* synthetic */ int a;

    public ObjectTypeAdapter$1(int i) {
        this.a = i;
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        if (etczVar.a == Object.class) {
            return new etbf(esydVar, this.a);
        }
        return null;
    }
}
