package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrm extends fgrs {
    public static final fguu a = new fgus(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
    public fgrl b;
    public fgsk c;
    public int d;

    public fgrm(String str) {
        super(fgsl.b("#root", fgsj.a), str);
        this.b = new fgrl();
        this.d = 1;
        this.c = fgsk.a();
    }

    @Override // defpackage.fgrs, defpackage.fgry
    public final String a() {
        return "#document";
    }

    @Override // defpackage.fgrs
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final fgrm c() {
        fgrm fgrmVar = (fgrm) super.c();
        fgrmVar.b = this.b.clone();
        return fgrmVar;
    }

    @Override // defpackage.fgry
    public final String hQ() {
        StringBuilder sbE = fgre.e();
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((fgry) this.g.get(i)).S(sbE);
        }
        String strC = fgre.c(sbE);
        boolean z = fgrz.a(this).c;
        return strC.trim();
    }

    public final fgrs j() {
        for (fgrs fgrsVar : t()) {
            if (fgrsVar.n().equals("html")) {
                return fgrsVar;
            }
        }
        return w("html");
    }
}
