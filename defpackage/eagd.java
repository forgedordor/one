package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagd implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean G;
    private boolean H;
    private boolean J;
    private boolean L;
    private boolean N;
    private boolean P;
    private boolean R;
    private boolean T;
    private boolean V;
    private boolean W;
    private boolean Z;
    public boolean o;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public eagf a = null;
    public eagf b = null;
    public eagf c = null;
    public eagf d = null;
    public eagf e = null;
    public eagf f = null;
    public eagf g = null;
    public eagf h = null;
    public eagf i = null;
    public eagf j = null;
    private eagf F = null;
    public eagf k = null;
    private eagf I = null;
    private eagf K = null;
    private eagf M = null;
    private eagf O = null;
    private eagf Q = null;
    public String l = "";
    public int m = 0;
    public String n = "";
    private String S = "";
    private String U = "";
    public String p = "";
    public String q = "";
    public String r = "";
    private boolean X = false;
    public final List s = new ArrayList();
    public final List t = new ArrayList();
    private boolean Y = false;
    private String aa = "";
    private boolean ab = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            eagf eagfVar = new eagf();
            eagfVar.readExternal(objectInput);
            this.u = true;
            this.a = eagfVar;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar2 = new eagf();
            eagfVar2.readExternal(objectInput);
            this.v = true;
            this.b = eagfVar2;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar3 = new eagf();
            eagfVar3.readExternal(objectInput);
            this.w = true;
            this.c = eagfVar3;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar4 = new eagf();
            eagfVar4.readExternal(objectInput);
            this.x = true;
            this.d = eagfVar4;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar5 = new eagf();
            eagfVar5.readExternal(objectInput);
            this.y = true;
            this.e = eagfVar5;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar6 = new eagf();
            eagfVar6.readExternal(objectInput);
            this.z = true;
            this.f = eagfVar6;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar7 = new eagf();
            eagfVar7.readExternal(objectInput);
            this.A = true;
            this.g = eagfVar7;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar8 = new eagf();
            eagfVar8.readExternal(objectInput);
            this.B = true;
            this.h = eagfVar8;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar9 = new eagf();
            eagfVar9.readExternal(objectInput);
            this.C = true;
            this.i = eagfVar9;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar10 = new eagf();
            eagfVar10.readExternal(objectInput);
            this.D = true;
            this.j = eagfVar10;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar11 = new eagf();
            eagfVar11.readExternal(objectInput);
            this.E = true;
            this.F = eagfVar11;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar12 = new eagf();
            eagfVar12.readExternal(objectInput);
            this.G = true;
            this.k = eagfVar12;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar13 = new eagf();
            eagfVar13.readExternal(objectInput);
            this.H = true;
            this.I = eagfVar13;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar14 = new eagf();
            eagfVar14.readExternal(objectInput);
            this.J = true;
            this.K = eagfVar14;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar15 = new eagf();
            eagfVar15.readExternal(objectInput);
            this.L = true;
            this.M = eagfVar15;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar16 = new eagf();
            eagfVar16.readExternal(objectInput);
            this.N = true;
            this.O = eagfVar16;
        }
        if (objectInput.readBoolean()) {
            eagf eagfVar17 = new eagf();
            eagfVar17.readExternal(objectInput);
            this.P = true;
            this.Q = eagfVar17;
        }
        this.l = objectInput.readUTF();
        this.m = objectInput.readInt();
        this.n = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.R = true;
            this.S = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.T = true;
            this.U = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.o = true;
            this.p = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.V = true;
            this.q = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.W = true;
            this.r = utf5;
        }
        this.X = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            eagc eagcVar = new eagc();
            eagcVar.readExternal(objectInput);
            this.s.add(eagcVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            eagc eagcVar2 = new eagc();
            eagcVar2.readExternal(objectInput);
            this.t.add(eagcVar2);
        }
        this.Y = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.Z = true;
            this.aa = utf6;
        }
        this.ab = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            this.a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H);
        if (this.H) {
            this.I.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.J);
        if (this.J) {
            this.K.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.L);
        if (this.L) {
            this.M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.N);
        if (this.N) {
            this.O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.P);
        if (this.P) {
            this.Q.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.l);
        objectOutput.writeInt(this.m);
        objectOutput.writeUTF(this.n);
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            objectOutput.writeUTF(this.S);
        }
        objectOutput.writeBoolean(this.T);
        if (this.T) {
            objectOutput.writeUTF(this.U);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            objectOutput.writeUTF(this.p);
        }
        objectOutput.writeBoolean(this.V);
        if (this.V) {
            objectOutput.writeUTF(this.q);
        }
        objectOutput.writeBoolean(this.W);
        if (this.W) {
            objectOutput.writeUTF(this.r);
        }
        objectOutput.writeBoolean(this.X);
        List list = this.s;
        int size = list.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((eagc) list.get(i)).writeExternal(objectOutput);
        }
        List list2 = this.t;
        int size2 = list2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((eagc) list2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.aa);
        }
        objectOutput.writeBoolean(this.ab);
    }
}
