package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uds {
    public final Context a;
    public final fcsu b;
    public final fcsu c;

    public uds(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public static /* synthetic */ dkri d(uds udsVar, ajpq ajpqVar) {
        ajpqVar.getClass();
        return udsVar.f(ajpqVar.a(), ajpqVar.e(), ajpqVar.b(), false);
    }

    private final dkpi e(Uri uri, String str, alqm alqmVar) {
        if (uri != null) {
            return new dkpf(uri, null, null, 1, null, 22);
        }
        final String strA = cpbs.a(cpbr.s(str, alqmVar));
        fdae fdaeVar = new fdae() { // from class: udp
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(((crlw) this.a.b.b()).d(strA));
            }
        };
        return str.length() == 0 ? new dkph(new udq(fdaeVar), 1, 1) : new dkpe(new udr(fdaeVar), str.charAt(0));
    }

    private final dkri f(Uri uri, String str, alqm alqmVar, boolean z) {
        return new dkrk(e(uri, str, alqmVar), "", true == z ? 4 : 1, 0, 0.0f, null, 56);
    }

    public final dkpi a(ChipData chipData) {
        chipData.getClass();
        if (chipData.c != null) {
            return e(chipData.d, chipData.b, chipData.a);
        }
        Uri uriM = cpbr.m(this.a);
        uriM.getClass();
        return new dkpf(uriM, null, null, 0, null, 30);
    }

    public final dkri b(ajou ajouVar, boolean z) {
        return f(ajouVar.a(), ajouVar.d(), ((ajpk) fcva.N(ajouVar.b())).a, z);
    }
}
