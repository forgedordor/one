package com.google.android.gms.auth;

import android.content.Intent;
import android.util.Log;
import defpackage.dbmi;
import defpackage.dbmy;
import defpackage.dclh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UserRecoverableAuthException extends dbmi {
    private final Intent a;
    private final dbmy b;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, dbmy.LEGACY);
    }

    public final Intent a() {
        Intent intent = this.a;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (iOrdinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (iOrdinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    public UserRecoverableAuthException(String str, Intent intent, dbmy dbmyVar) {
        super(str);
        this.a = intent;
        dclh.m(dbmyVar);
        this.b = dbmyVar;
    }
}
