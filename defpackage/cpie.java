package defpackage;

import android.database.Cursor;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class cpie extends fdbo implements fdap {
    public cpie(Object obj) {
        super(1, obj, cpii.class, "readSystemBlockListRow", "readSystemBlockListRow-JfnmSAo(Landroid/database/Cursor;)Ljava/lang/String;", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) throws IOException {
        Cursor cursor = ((egrr) obj).a;
        int i = cpii.c;
        eieu eieuVarH = eiiy.h("BlockListResolver#getUpdatedList#queryBugle");
        try {
            String strB = egrr.b(cursor, egrr.a(cursor, "e164_number"));
            if (strB.length() != 0) {
                fczl.a(eieuVarH, null);
                return strB;
            }
            String strB2 = egrr.b(cursor, egrr.a(cursor, "original_number"));
            if (strB2.length() == 0) {
                fczl.a(eieuVarH, null);
                return "";
            }
            fczl.a(eieuVarH, null);
            return strB2;
        } finally {
        }
    }
}
