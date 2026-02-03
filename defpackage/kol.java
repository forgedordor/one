package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kol {
    public static ListenableFuture a(koi koiVar) {
        kog kogVar = new kog();
        kok kokVar = new kok(kogVar);
        kogVar.b = kokVar;
        kogVar.a = koiVar.getClass();
        try {
            Object objA = koiVar.a(kogVar);
            if (objA != null) {
                kogVar.a = objA;
            }
            return kokVar;
        } catch (Exception e) {
            kokVar.a(e);
            return kokVar;
        }
    }
}
