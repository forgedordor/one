package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coly extends dqye {
    public coly() {
        super("file_transfer");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final colx b() {
        ah();
        return new colx(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(aucl auclVar) {
        if (auclVar == null) {
            this.a.putNull("attachment_upload_response");
        } else {
            this.a.put("attachment_upload_response", auclVar.toByteArray());
        }
    }

    public final void d(aucj aucjVar) {
        int iIntValue = comb.d().intValue();
        int iIntValue2 = comb.d().intValue();
        if (iIntValue2 < 59910) {
            dqru.x("thumbnail_information", iIntValue2);
        }
        if (iIntValue >= 59910) {
            if (aucjVar == null) {
                this.a.putNull("thumbnail_information");
            } else {
                this.a.put("thumbnail_information", aucjVar.toByteArray());
            }
        }
    }

    public final void e(String str) {
        int iIntValue = comb.d().intValue();
        int iIntValue2 = comb.d().intValue();
        if (iIntValue2 < 55030) {
            dqru.x("transfer_handle", iIntValue2);
        }
        if (iIntValue >= 55030) {
            dqru.v(this.a, "transfer_handle", str);
        }
    }

    public final void f(Function function) {
        String[] strArr = comb.a;
        af(new colz((coma) function.apply(new coma())));
    }
}
