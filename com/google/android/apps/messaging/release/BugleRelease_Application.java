package com.google.android.apps.messaging.release;

import defpackage.ahoz;
import defpackage.ehli;
import defpackage.ehnn;
import defpackage.eidc;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eiik;
import defpackage.eiiy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleRelease_Application extends ahoz {
    @Override // defpackage.ahoz, defpackage.squ, defpackage.aoll, defpackage.ehnm, android.app.Application
    public final void onCreate() {
        eieu eieuVarK;
        if (!f()) {
            super.onCreate();
            return;
        }
        eiik eiikVarC = eiik.c();
        if (eiikVarC.f()) {
            long jB = ehnn.b();
            eieh eiehVarE = ((ehnn.a) ehli.a(this, ehnn.a.class)).b().e("com/google/apps/tiktok/inject/baseclasses/TikTokApplicationTrace", "beginOnCreateTrace", 52, ehnn.a(jB), jB * 1000000);
            try {
                eidc.r();
                eieuVarK = eiiy.k("Application.onCreate");
                try {
                    super.onCreate();
                    eieuVarK.close();
                    eiehVarE.close();
                } finally {
                }
            } finally {
            }
        } else {
            eifp eifpVarA = eiikVarC.a();
            try {
                eieuVarK = eiiy.k("Application creation");
                try {
                    eieu eieuVarK2 = eiiy.k("Application.onCreate");
                    try {
                        super.onCreate();
                        eieuVarK2.close();
                        eieuVarK.close();
                        eifpVarA.close();
                    } finally {
                    }
                } finally {
                    try {
                        eieuVarK.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        }
    }
}
