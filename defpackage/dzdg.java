package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dzdg {
    public static boolean a(dzdh dzdhVar) {
        Rect rect = new Rect();
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) dzdhVar).c;
        boolean globalVisibleRect = accountParticleDisc.getGlobalVisibleRect(rect);
        int[] iArr = ley.a;
        return accountParticleDisc.isLaidOut() && accountParticleDisc.isShown() && globalVisibleRect;
    }
}
