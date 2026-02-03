package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byge extends bzar {
    private final String a;
    private final MessagesTable.BindData b;
    private final ekgb c;
    private final Optional d;
    private final bpvd e;

    public byge(String str, MessagesTable.BindData bindData, ekgb ekgbVar, Optional optional, bpvd bpvdVar) {
        this.a = str;
        this.b = bindData;
        this.c = ekgbVar;
        this.d = optional;
        this.e = bpvdVar;
    }

    @Override // defpackage.bzar
    public final bpvd a() {
        return this.e;
    }

    @Override // defpackage.bzar
    public final MessagesTable.BindData b() {
        return this.b;
    }

    @Override // defpackage.bzar
    public final ekgb c() {
        return this.c;
    }

    @Override // defpackage.bzar
    public final Optional d() {
        return this.d;
    }

    @Override // defpackage.bzar
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        bpvd bpvdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzar) {
            bzar bzarVar = (bzar) obj;
            if (this.a.equals(bzarVar.e()) && this.b.equals(bzarVar.b()) && ekjz.h(this.c, bzarVar.c()) && this.d.equals(bzarVar.d()) && ((bpvdVar = this.e) != null ? bpvdVar.equals(bzarVar.a()) : bzarVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        bpvd bpvdVar = this.e;
        return (iHashCode * 1000003) ^ (bpvdVar == null ? 0 : bpvdVar.hashCode());
    }

    public final String toString() {
        bpvd bpvdVar = this.e;
        Optional optional = this.d;
        ekgb ekgbVar = this.c;
        return "MessageBulkInsertionContainer{cmsId=" + this.a + ", messagesTableBindData=" + this.b.toString() + ", partsTableBindDataList=" + ekgbVar.toString() + ", additionalFields=" + String.valueOf(optional) + ", linkPreviewBindData=" + String.valueOf(bpvdVar) + "}";
    }
}
