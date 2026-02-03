package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.eszu;
import defpackage.etaa;
import defpackage.etaz;
import defpackage.etbp;
import defpackage.etcz;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CollectionTypeAdapterFactory implements esyw {
    private final eszu a;

    public CollectionTypeAdapterFactory(eszu eszuVar) {
        this.a = eszuVar;
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        Class cls = etczVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeD = etaa.d(etczVar.b, cls, Collection.class);
        Class cls2 = typeD instanceof ParameterizedType ? ((ParameterizedType) typeD).getActualTypeArguments()[0] : Object.class;
        return new etaz(new etbp(esydVar, esydVar.a(new etcz(cls2)), cls2), this.a.a(etczVar, false));
    }
}
