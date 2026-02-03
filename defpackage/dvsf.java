package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dvsf implements ejvr {
    @Override // defpackage.ejvr
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            dwmn dwmnVar = new dwmn();
            dwmnVar.b(true);
            return dwmnVar.a();
        }
        dwmn dwmnVar2 = new dwmn();
        dwmnVar2.b(false);
        return dwmnVar2.a();
    }
}
