package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwg {
    public static final boolean a(alqm alqmVar, Uri uri) {
        if (alqmVar == null || alqmVar.b().isEmpty()) {
            return false;
        }
        return uri == null || fdbq.f(cpbr.t(uri), "d") || cqmz.m(uri);
    }
}
