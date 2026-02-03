package defpackage;

import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.time.temporal.TemporalAccessor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyg extends fcyz implements fdap {
    Object a;
    int b;
    final /* synthetic */ fdap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxyg(fdap fdapVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.c = fdapVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(cssu.a);
            fdap fdapVar = this.c;
            this.a = dateTimeFormatterWithZone;
            this.b = 1;
            Object objInvoke = fdapVar.invoke(this);
            if (objInvoke == fcylVar) {
                return fcylVar;
            }
            obj2 = dateTimeFormatterWithZone;
            obj = objInvoke;
        }
        return ((DateTimeFormatter) obj2).format((TemporalAccessor) obj);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxyg(this.c, (fcxy) obj).b(fctx.a);
    }
}
