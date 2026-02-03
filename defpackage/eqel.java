package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqel extends eqen {
    public eqcz a;
    public byte b;
    private String c;
    private ezol d;
    private ezol e;
    private eqep f;
    private ekfw g;
    private ekgb h;
    private ezol i;
    private int j;

    @Override // defpackage.eqen
    public final ekfw a() {
        if (this.g == null) {
            if (this.h == null) {
                int i = ekgb.d;
                this.g = new ekfw();
                this.b = (byte) (this.b | 32);
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.g = ekfwVar;
                ekfwVar.j(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.eqen
    public final eqeq b() {
        ekfw ekfwVar = this.g;
        if (ekfwVar != null) {
            this.h = ekfwVar.g();
        } else if (this.h == null) {
            int i = ekgb.d;
            this.h = ekoe.a;
        }
        int i2 = ~this.b;
        if ((i2 & 31) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" messageId");
            }
            if ((this.b & 2) == 0) {
                sb.append(" senderId");
            }
            if ((this.b & 4) == 0) {
                sb.append(" recipientId");
            }
            if ((this.b & 8) == 0) {
                sb.append(" messageType");
            }
            if ((this.b & 16) == 0) {
                sb.append(" messagePriority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        String str = this.c;
        ezol ezolVar = this.d;
        ezol ezolVar2 = this.e;
        eqep eqepVar = this.f;
        int i3 = this.j;
        ekgb ekgbVar = this.h;
        ezol ezolVar3 = this.i;
        eqcz eqczVar = this.a;
        ezol ezolVar4 = ezolVar3;
        if ((i2 & 32) != 0) {
            int i4 = ekgb.d;
            ekgbVar = ekoe.a;
        }
        if ((i2 & 64) != 0) {
            ezolVar4 = null;
        }
        return new eqeq(str, ezolVar, ezolVar2, eqepVar, i3, ekgbVar, ezolVar4, (i2 & 128) != 0 ? null : eqczVar);
    }

    @Override // defpackage.eqen
    public final void c(ezol ezolVar) {
        this.i = ezolVar;
        this.b = (byte) (this.b | 64);
    }

    @Override // defpackage.eqen
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.c = str;
        this.b = (byte) (this.b | 1);
    }

    @Override // defpackage.eqen
    public final void e(eqep eqepVar) {
        if (eqepVar == null) {
            throw new NullPointerException("Null messageType");
        }
        this.f = eqepVar;
        this.b = (byte) (this.b | 8);
    }

    @Override // defpackage.eqen
    public final void f(ezol ezolVar) {
        if (ezolVar == null) {
            throw new NullPointerException("Null recipientId");
        }
        this.e = ezolVar;
        this.b = (byte) (this.b | 4);
    }

    @Override // defpackage.eqen
    public final void g(ezol ezolVar) {
        if (ezolVar == null) {
            throw new NullPointerException("Null senderId");
        }
        this.d = ezolVar;
        this.b = (byte) (this.b | 2);
    }

    @Override // defpackage.eqen
    public final void h(int i) {
        this.j = i;
        this.b = (byte) (this.b | 16);
    }
}
