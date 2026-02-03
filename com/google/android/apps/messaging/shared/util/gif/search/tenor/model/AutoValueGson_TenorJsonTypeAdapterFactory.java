package com.google.android.apps.messaging.shared.util.gif.search.tenor.model;

import defpackage.cqpi;
import defpackage.cqpk;
import defpackage.cqpm;
import defpackage.cqpo;
import defpackage.cqpq;
import defpackage.cqps;
import defpackage.cqpt;
import defpackage.cqpu;
import defpackage.cqpv;
import defpackage.cqpw;
import defpackage.esyd;
import defpackage.esyv;
import defpackage.etcz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValueGson_TenorJsonTypeAdapterFactory extends TenorJsonTypeAdapterFactory {
    @Override // defpackage.esyw
    public final esyv a(esyd esydVar, etcz etczVar) {
        Class cls = etczVar.a;
        if (cqps.class.isAssignableFrom(cls)) {
            return new cqpi(esydVar);
        }
        if (cqpt.class.isAssignableFrom(cls)) {
            return new cqpk(esydVar);
        }
        if (cqpu.class.isAssignableFrom(cls)) {
            return new cqpm(esydVar);
        }
        if (cqpv.class.isAssignableFrom(cls)) {
            return new cqpo(esydVar);
        }
        if (cqpw.class.isAssignableFrom(cls)) {
            return new cqpq(esydVar);
        }
        return null;
    }
}
