package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlh {
    private static final ekgp d;
    public final eg a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final eigp h;

    static {
        ekgi ekgiVar = new ekgi();
        tlq tlqVar = tlq.BLOCK;
        Integer numValueOf = Integer.valueOf(R.string.block_dialog_title_2024_05_10);
        ekgiVar.i(tlqVar, numValueOf);
        ekgiVar.i(tlq.RBM_BLOCK, numValueOf);
        tlq tlqVar2 = tlq.SPAM;
        Integer numValueOf2 = Integer.valueOf(R.string.spam_dialog_title_2024_05_10);
        ekgiVar.i(tlqVar2, numValueOf2);
        ekgiVar.i(tlq.GROUP_SPAM, numValueOf2);
        d = ekgiVar.c();
    }

    public tlh(eg egVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eigp eigpVar, fcsu fcsuVar5) {
        this.a = egVar;
        this.b = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = eigpVar;
        this.c = fcsuVar5;
    }

    public static IllegalArgumentException b(tlq tlqVar) {
        return new IllegalArgumentException(String.format("Unknown DialogType: %s", tlqVar));
    }

    private static ParticipantsTable.BindData d(tlr tlrVar) {
        return ((tjl) ((tjt) tlrVar).f).a;
    }

    final CharSequence a(tlr tlrVar) {
        String strO = d(tlrVar).O();
        if (TextUtils.isEmpty(strO)) {
            strO = this.a.getString(R.string.unknown_sender);
        }
        if (bbbe.d(d(tlrVar))) {
            return strO;
        }
        return ((cpga) this.g.b()).b(cssf.c(strO.replace(' ', (char) 160)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final defpackage.tlr r28) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlh.c(tlr):void");
    }
}
