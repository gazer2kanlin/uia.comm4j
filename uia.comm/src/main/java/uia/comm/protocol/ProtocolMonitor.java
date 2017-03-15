/*******************************************************************************
 * * Copyright (c) 2015, UIA * All rights reserved. * Redistribution and use in source and binary forms, with or without * modification, are permitted provided that the following conditions are met: * * * Redistributions of source code must retain
 * the above copyright * notice, this list of conditions and the following disclaimer. * * Redistributions in binary form must reproduce the above copyright * notice, this list of conditions and the following disclaimer in the * documentation and/or
 * other materials provided with the distribution. * * Neither the name of the {company name} nor the * names of its contributors may be used to endorse or promote products * derived from this software without specific prior written permission. * *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS "AS IS" AND ANY * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE * DISCLAIMED. IN NO
 * EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; * LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS * SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/
package uia.comm.protocol;

/**
 * 
 * @author Kyle
 * 
 */
public interface ProtocolMonitor<C> {

    /**
     * Get protocol which creates this monitor.
     * 
     * @return The protocol.
     */
    public Protocol<C> getProtocol();

    /**
     * Get the name.
     * 
     * @return The name.
     */
    public String getName();

    /**
     * Read a byte from input source.
     * 
     * @param one One byte.
     */
    public void read(byte one);

    /**
     * call when no data in data channel.
     */
    public void readEnd();

    /**
     * reset monitor to idle state.
     */
    public void reset();

    /**
     * Get the controller of the monitor.
     * 
     * @return The controller.
     */
    public C getController();

    /**
     * Set the controller of ths monitor.
     * 
     * @param controller The controller.
     */
    public void setController(C controller);

    /**
     * If monitor is running or idle.
     * @return Running or not.
     */
    public boolean isRunning();
    
    /**
     * Get state.
     * @return State.
     */
    public String getStateInfo();
}
