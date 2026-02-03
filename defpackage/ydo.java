package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydo extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ yek c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydo(fcxy fcxyVar, yek yekVar) {
        super(3, fcxyVar);
        this.c = yekVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ydo ydoVar = new ydo((fcxy) obj3, this.c);
        ydoVar.d = (fdpm) obj;
        ydoVar.b = (Object[]) obj2;
        return ydoVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.d;
            Object obj2 = this.b;
            eieu eieuVarH = eiiy.h("PagedMessageListUiAdapterImpl#messageFlow");
            try {
                Object obj3 = ((Object[]) obj2)[0];
                obj3.getClass();
                Object obj4 = ((Object[]) obj2)[1];
                obj4.getClass();
                bxuv bxuvVar = (bxuv) ((Object[]) obj2)[2];
                aafp aafpVar = (aafp) ((Object[]) obj2)[3];
                Object obj5 = ((Object[]) obj2)[4];
                obj5.getClass();
                Object obj6 = ((Object[]) obj2)[5];
                obj6.getClass();
                int iIntValue = ((Integer) obj6).intValue();
                MessageId messageId = (MessageId) ((Object[]) obj2)[6];
                Object obj7 = ((Object[]) obj2)[7];
                obj7.getClass();
                boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = ((Object[]) obj2)[8];
                obj8.getClass();
                boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                Object obj9 = ((Object[]) obj2)[9];
                obj9.getClass();
                boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                Instant instant = (Instant) ((Object[]) obj2)[10];
                Object obj10 = ((Object[]) obj2)[11];
                obj10.getClass();
                ycu ycuVar = new ycu((zny) obj3, (zqw) obj4, bxuvVar, aafpVar, (yca) obj5, iIntValue, messageId, zBooleanValue, zBooleanValue2, zBooleanValue3, instant, ((Boolean) obj10).booleanValue());
                zny znyVar = ycuVar.a;
                zqw zqwVar = ycuVar.b;
                bxuv bxuvVar2 = ycuVar.c;
                aafp aafpVar2 = ycuVar.d;
                yca ycaVar = ycuVar.e;
                int i2 = ycuVar.f;
                MessageId messageId2 = ycuVar.g;
                boolean z = ycuVar.h;
                boolean z2 = ycuVar.i;
                boolean z3 = ycuVar.j;
                Instant instant2 = ycuVar.k;
                boolean z4 = ycuVar.l;
                yek yekVar = this.c;
                ych ychVar = yekVar.r;
                ychVar.a.clear();
                ychVar.b.clear();
                fdce fdceVar = new fdce();
                fdceVar.a = true;
                oux ouxVarA = ovr.a(znyVar.b, new ydf(yekVar, fdceVar, ycaVar, zqwVar, aafpVar2, z2, z3, i2, instant2, z, messageId2, znyVar.a, z4, bxuvVar2, null));
                fczl.a(eieuVarH, null);
                this.a = 1;
                if (r2.fO(ouxVarA, this) == fcylVar) {
                    return fcylVar;
                }
            } finally {
            }
        }
        return fctx.a;
    }
}
