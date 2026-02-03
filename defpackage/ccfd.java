package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccfd {
    public final ccfe a;
    public final ccfe b;
    public final ccfe c;
    final ccfe[] d;

    public ccfd() {
        dqpr dqprVarM = dqpt.m();
        dqog dqogVar = (dqog) dqprVarM;
        dqogVar.e = 4;
        dqprVarM.l(true);
        dqprVarM.k(true);
        dqprVarM.g(true);
        dqprVarM.d(true);
        dqogVar.a = "mls_group_states.identity_id";
        dqprVarM.i(-1);
        dqogVar.d = new Supplier() { // from class: ccex
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccfu.a();
            }
        };
        dqogVar.c = new dqps() { // from class: ccey
        };
        ccfe ccfeVar = new ccfe(dqprVarM.a());
        this.a = ccfeVar;
        dqpr dqprVarM2 = dqpt.m();
        dqog dqogVar2 = (dqog) dqprVarM2;
        dqogVar2.e = 4;
        dqprVarM2.l(true);
        dqprVarM2.k(true);
        dqprVarM2.g(true);
        dqprVarM2.d(true);
        dqogVar2.a = "mls_group_states.group_id";
        dqprVarM2.i(-1);
        dqogVar2.d = new Supplier() { // from class: ccez
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccfu.a();
            }
        };
        dqogVar2.c = new dqps() { // from class: ccfa
        };
        ccfe ccfeVar2 = new ccfe(dqprVarM2.a());
        this.b = ccfeVar2;
        dqpr dqprVarM3 = dqpt.m();
        dqog dqogVar3 = (dqog) dqprVarM3;
        dqogVar3.e = 5;
        dqprVarM3.k(true);
        dqogVar3.a = "mls_group_states.epoch_data";
        dqprVarM3.i(-1);
        dqogVar3.d = new Supplier() { // from class: ccfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return ccfu.a();
            }
        };
        dqogVar3.c = new dqps() { // from class: ccfc
        };
        ccfe ccfeVar3 = new ccfe(dqprVarM3.a());
        this.c = ccfeVar3;
        this.d = new ccfe[]{ccfeVar, ccfeVar2, ccfeVar3};
    }
}
