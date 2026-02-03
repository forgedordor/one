package com.google.gson.internal.bind;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.esyw;
import defpackage.eszu;
import defpackage.etaa;
import defpackage.etbd;
import defpackage.etbp;
import defpackage.etcq;
import defpackage.etcz;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MapTypeAdapterFactory implements esyw {
    private final eszu a;

    public MapTypeAdapterFactory(eszu eszuVar) {
        this.a = eszuVar;
    }

    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        Type[] actualTypeArguments;
        Class cls = etczVar.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeD = etaa.d(etczVar.b, cls, Map.class);
            actualTypeArguments = typeD instanceof ParameterizedType ? ((ParameterizedType) typeD).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type = actualTypeArguments[0];
        Type type2 = actualTypeArguments[1];
        return new etbd(new etbp(esydVar, (type == Boolean.TYPE || type == Boolean.class) ? etcq.f : esydVar.a(new etcz(type)), type), new etbp(esydVar, esydVar.a(new etcz(type2)), type2), this.a.a(etczVar, false));
    }
}
