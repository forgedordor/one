package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dbpb {
    public static Bundle a(dbpd dbpdVar) {
        liu liuVarA = dbpdVar.a();
        if (liuVarA == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (liuVarA.c) {
            bundle.putInt("authentication_result_type", liuVarA.a.a);
            return bundle;
        }
        lis lisVar = liuVarA.b;
        bundle.putInt("authentication_error_code", lisVar.a);
        CharSequence charSequence = lisVar.b;
        if (charSequence == null) {
            return bundle;
        }
        bundle.putString("authentication_error_message", charSequence.toString());
        return bundle;
    }
}
