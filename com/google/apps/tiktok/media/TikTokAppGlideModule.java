package com.google.apps.tiktok.media;

import android.content.Context;
import defpackage.ehli;
import defpackage.ejwi;
import defpackage.ejwt;
import defpackage.raw;
import defpackage.rbb;
import defpackage.rbn;
import defpackage.rso;
import defpackage.rsp;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TikTokAppGlideModule extends rso {

    /* compiled from: PG */
    public interface a {
        ejwi eD();

        Set fS();
    }

    @Override // defpackage.rso
    public final void c(Context context, rbb rbbVar) {
        ((rso) ((ejwt) ((a) ehli.a(context, a.class)).eD()).a).c(context, rbbVar);
    }

    @Override // defpackage.rsp
    public final void d(Context context, raw rawVar, rbn rbnVar) {
        ((a) ehli.a(context, a.class)).eD();
        Iterator it = ((a) ehli.a(context, a.class)).fS().iterator();
        while (it.hasNext()) {
            ((rsp) it.next()).d(context, rawVar, rbnVar);
        }
    }
}
