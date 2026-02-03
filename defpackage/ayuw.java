package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayuw implements dqoe {
    public static final Map a = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("conversation_id"), d("conversation_id")), new fcti(c("participant_id"), d("participant_id")), new fcti(c("is_normalized"), d("is_normalized")), new fcti(c("rcs_group_join_status"), d("rcs_group_join_status")));

    private static final ayub c(String str) {
        dqpo[] dqpoVarArrC = ayup.c();
        for (int i = 0; i < 6; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (ayub) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bobk d(String str) {
        dqpo[] dqpoVarArrC = boby.c();
        for (int i = 0; i < 6; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bobk) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        throw null;
    }

    @Override // defpackage.dqoe
    public final void b() {
        throw null;
    }
}
