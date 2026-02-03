package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azza {
    public static final fcsu a = new fcsu() { // from class: azyz
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = azbe.a;
            azbb azbbVar = new azbb(azbe.a);
            azbbVar.A("duplicateLinkPreviewQuery");
            azbbVar.v();
            azai azaiVar = azbe.c;
            azbbVar.n(new dqxl("$V", new Object[]{azaiVar.a}), "backup_id");
            bpwi bpwiVar = bpxj.c;
            azbbVar.n(new dqxl("$V{J:bugle_link_preview}", new Object[]{bpwiVar.a}), "bugle_id");
            azbb azbbVar2 = (azbb) azbbVar.j(azvg.c(azaiVar.b, azvt.b, "message_link_preview_id_map", false, 16));
            bpxe bpxeVarB = bpxj.b();
            bpxeVarB.v();
            dqtr dqtrVarH = dqts.h(bpxeVarB.a());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            bmkmVar.ar(new dqxl("$V{J:bugle_link_preview} = $V{J:message_link_preview_id_map}", new Object[]{bpwiVar.b, bmkn.c.d}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_link_preview";
            return fcva.b((azbb) azbbVar2.j(dqtrVarH));
        }
    };
}
