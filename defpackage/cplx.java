package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplx extends cptz {
    public btxd a;
    private ParticipantsTable.BindData b;
    private long c;
    private byte d;

    @Override // defpackage.cptz
    public final cpua a() {
        ParticipantsTable.BindData bindData;
        if (this.d == 1 && (bindData = this.b) != null) {
            return new cply(bindData, this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" participant");
        }
        if (this.d == 0) {
            sb.append(" linkPreviewCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cptz
    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    @Override // defpackage.cptz
    public final void c(ParticipantsTable.BindData bindData) {
        if (bindData == null) {
            throw new NullPointerException("Null participant");
        }
        this.b = bindData;
    }
}
