package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqn extends ea implements dtki {
    private static final eksp ag = eksp.c("GnpSdk");
    public dsql a = null;
    private boolean ah;
    public dsqm b;
    public dsqs c;
    public boolean d;
    public dsom e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.M(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.gm_feature_highlight_fragment, viewGroup);
    }

    public final void a() {
        fr frVar;
        if (G() == null || G().isFinishing() || !aF() || this.s || (frVar = this.B) == null) {
            return;
        }
        cg cgVar = new cg(frVar);
        cgVar.o(this);
        cgVar.k();
    }

    @Override // defpackage.dtki
    public final dtkh b() {
        dsql dsqlVar = this.a;
        if (dsqlVar != null) {
            return dsqlVar.d;
        }
        return null;
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            ((drzh) ((fcsu) dxkg.a(context).fL().get(dsqn.class)).b()).a(this);
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) ag.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightFragment", "onAttach", 'r', "FeatureHighlightFragment.java")).q("Failed to inject members.");
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("showing")) {
            z = true;
        }
        this.ah = z;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("showing", this.ah);
        this.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x025c A[Catch: dsph -> 0x04c9, TryCatch #1 {dsph -> 0x04c9, blocks: (B:26:0x0090, B:28:0x00b2, B:30:0x00b7, B:32:0x00bb, B:33:0x00bd, B:34:0x00c3, B:36:0x00c9, B:38:0x00cd, B:40:0x00d1, B:41:0x00d3, B:43:0x00db, B:44:0x00dd, B:45:0x00e5, B:47:0x00e9, B:48:0x00eb, B:49:0x00f1, B:51:0x00f7, B:53:0x00fb, B:54:0x00fd, B:55:0x0103, B:57:0x0109, B:59:0x010d, B:60:0x010f, B:61:0x0116, B:63:0x011c, B:65:0x0120, B:66:0x0122, B:67:0x0129, B:69:0x012f, B:71:0x0133, B:72:0x0135, B:118:0x0207, B:120:0x020d, B:122:0x0215, B:123:0x0217, B:125:0x021d, B:127:0x0222, B:126:0x0220, B:128:0x0224, B:130:0x022a, B:131:0x022e, B:133:0x0232, B:135:0x0236, B:136:0x0238, B:138:0x0242, B:139:0x0244, B:141:0x024a, B:143:0x0254, B:144:0x0256, B:146:0x025c, B:148:0x0266, B:150:0x026c, B:152:0x0270, B:153:0x0272, B:160:0x0287, B:162:0x0290, B:164:0x0294, B:165:0x0296, B:154:0x0277, B:156:0x027d, B:158:0x0281, B:159:0x0283, B:168:0x02a3, B:169:0x02c9, B:171:0x02d3, B:172:0x02d5, B:174:0x02d9, B:175:0x02db, B:177:0x02e6, B:178:0x02e8, B:180:0x02f5, B:182:0x02f9, B:183:0x02fb, B:184:0x0302, B:186:0x0308, B:188:0x030c, B:189:0x030e, B:190:0x0315, B:75:0x0141, B:77:0x0178, B:78:0x017c, B:80:0x0186, B:81:0x0188, B:83:0x018c, B:84:0x018e, B:86:0x0199, B:87:0x019b, B:89:0x01a6, B:90:0x01a8, B:92:0x01b4, B:94:0x01b8, B:95:0x01ba, B:96:0x01c0, B:98:0x01ca, B:99:0x01cc, B:101:0x01d2, B:103:0x01d6, B:104:0x01d8, B:106:0x01e0, B:107:0x01e2, B:112:0x01f6, B:114:0x01fb, B:116:0x01ff, B:117:0x0201, B:108:0x01ea, B:110:0x01ee, B:111:0x01f0), top: B:224:0x0090 }] */
    @Override // defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsqn.l():void");
    }
}
