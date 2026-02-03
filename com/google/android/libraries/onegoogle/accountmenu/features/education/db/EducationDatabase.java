package com.google.android.libraries.onegoogle.accountmenu.features.education.db;

import android.content.Context;
import defpackage.dylq;
import defpackage.pej;
import defpackage.peu;
import defpackage.pex;
import defpackage.phj;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class EducationDatabase extends pex {
    public static EducationDatabase x(Context context, Executor executor) {
        peu peuVarA = pej.a(context.getApplicationContext(), EducationDatabase.class, "og_education.db");
        peuVarA.e(executor);
        if (peuVarA.h != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        peuVarA.b = executor;
        peuVarA.e.add(1);
        peuVarA.b(new phj[0]);
        return (EducationDatabase) peuVarA.a();
    }

    public abstract dylq y();
}
